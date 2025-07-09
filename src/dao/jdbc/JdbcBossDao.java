package dao.jdbc;

import dao.BossDao;
import model.Boss;
import model.Weakness;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcBossDao implements BossDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcBossDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Boss getBossById(int id) {
        String sql = "SELECT * FROM boss WHERE id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            return mapRowToBoss(results);
        }
        return null;
    }

    @Override
    public List<Boss> getAllBosses() {
        List<Boss> bosses = new ArrayList<>();
        String sql = "SELECT * FROM boss";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            bosses.add(mapRowToBoss(results));
        }
        return bosses;
    }

    @Override
    public List<Boss> getBossesByLocationId(int locationId) {
        List<Boss> bosses = new ArrayList<>();
        String sql = "SELECT * FROM boss WHERE location_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, locationId);
        while (results.next()) {
            bosses.add(mapRowToBoss(results));
        }
        return bosses;
    }

    @Override
    public int createBoss(Boss boss) {
        String sql = "INSERT INTO boss (name, base_hp, base_runes, is_required, location_id) " +
                "VALUES (?, ?, ?, ?, ?) RETURNING id";
        return jdbcTemplate.queryForObject(sql, Integer.class,
                boss.getName(), boss.getBaseHp(), boss.getBaseRunes(), boss.isRequired(), boss.getLocationId());
    }

    @Override
    public void updateBoss(Boss boss) {
        String sql = "UPDATE boss SET name = ?, base_hp = ?, base_runes = ?, is_required = ?, location_id = ? " +
                "WHERE id = ?";
        jdbcTemplate.update(sql, boss.getName(), boss.getBaseHp(), boss.getBaseRunes(),
                boss.isRequired(), boss.getLocationId(), boss.getId());
    }

    @Override
    public void deleteBossById(int id) {
        String sql = "DELETE FROM boss WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    private Boss mapRowToBoss(SqlRowSet rowSet) {
        Boss boss = new Boss();
        boss.setId(rowSet.getInt("id"));
        boss.setName(rowSet.getString("name"));
        boss.setBaseHp(rowSet.getInt("base_hp"));
        boss.setBaseRunes(rowSet.getInt("base_runes"));
        boss.setRequired(rowSet.getBoolean("is_required"));
        boss.setLocationId(rowSet.getInt("location_id"));
        // Weaknesses will be fetched separately if needed
        return boss;
    }
}