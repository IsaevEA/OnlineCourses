public class MathCourse extends AbstractCourse implements Onsiteable{
    public MathCourse() {
    }

    public MathCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("Проведение урока математики");
    }

    @Override
    public void arrangeClassroom() {
        System.out.println("Организация класса для урока математики");
    }
}
