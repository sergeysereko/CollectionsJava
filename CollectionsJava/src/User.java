import java.util.HashSet;
public class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public User(String name, int age) {
        this(name,age,"+380935687812");
    }

    public User(String name) {
        this(name,38);
    }

    public User() {
        this("Иван");
    }


    // Переопределение hashCode для обработки всех полей
    // Это простейший пример и не всегда является оптимальным выбором
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + phone.hashCode();
        return result;
    }

    // Переопределение equals для сравнения всех полей
    // Важно также переопределить метод equals, чтобы он соответствовал переопределенному hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User otherUser = (User) obj;
        return name.equals(otherUser.name) && age == otherUser.age && phone.equals(otherUser.phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
