package homeworks.homework_12.entity_manager;

import java.util.Objects;

public class User extends Entity {

    public User(String name, int age, boolean active) {
        super(name, age, active);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        User user = (User) object;
        return getAge() == user.getAge()
                && isActive() == user.isActive()
                && Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isActive());
    }
}
