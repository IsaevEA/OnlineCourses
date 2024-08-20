import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TrainingCenter trainingCenter = new TrainingCenter();
        ArrayList<AbstractCourse> arrayList = new ArrayList<>();
        trainingCenter.setArrayList(arrayList);
        trainingCenter.addCourse(new ProgrammingCourse("Металабс", 180, "Азат"));
        trainingCenter.addCourse(new MathCourse("как то там", 180, "кто то там"));
        trainingCenter.addCourse(new DesignCourse("Мода", 180, "айдана"));
        trainingCenter.addCourse(new LanguageCourse("Тил академиясы", 180, "Урмат"));


        trainingCenter.startCourse();

    }
}