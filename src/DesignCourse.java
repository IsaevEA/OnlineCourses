public class DesignCourse extends AbstractCourse implements Onsiteable{
    public DesignCourse() {
    }

    public DesignCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("Проведение урока дизайна");
    }

    @Override
    public void arrangeClassroom() {
        System.out.println("Организация класса для урока Дизайна");
    }
}
