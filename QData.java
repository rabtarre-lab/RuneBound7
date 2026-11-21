package me.settings;

import java.util.*;

/** Данные игрока: руны, прогресс заданий, серия дней, покупки. */
public class QData {
    public String name = "";
    public long runes, totalEarned;
    public int completedTotal, streak, bestStreak;
    public boolean notify = true, dailyBonus, weeklyBonus;
    public String dailyKey = "", weeklyKey = "", lastStreakDay = "", trail = "";
    public List<String> daily = new ArrayList<>();
    public List<String> weekly = new ArrayList<>();
    public final Map<String, Integer> progress = new HashMap<>();
    public final Set<String> claimed = new HashSet<>();
    public final Set<String> owned = new HashSet<>();
}
