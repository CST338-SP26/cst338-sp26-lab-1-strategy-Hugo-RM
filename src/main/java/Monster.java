import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    HashMap<String, Integer> items;
    Integer maxHp;

    Integer xp = 10;
    Integer hp;

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.xp = xp;
        this.items = items;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getItems(), monster.getItems()) && Objects.equals(getMaxHp(), monster.getMaxHp()) && Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItems(), getMaxHp(), getHp(), getXp());
    }

    @Override
    public String toString() {
        return "hp=" + hp.toString() + "/" + maxHp.toString();
    }
}
