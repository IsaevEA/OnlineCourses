import java.util.ArrayList;

public class TrainingCenter {
    private ArrayList<AbstractCourse> arrayList = new ArrayList<>();

    public TrainingCenter(ArrayList<AbstractCourse> arrayList) {
        this.arrayList = arrayList;
    }

    public TrainingCenter() {
    }

    public ArrayList<AbstractCourse> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<AbstractCourse> arrayList) {
        this.arrayList = arrayList;
    }

    public void addCourse(AbstractCourse  abstractCourse){
        arrayList.add(abstractCourse);
    }

    public void startCourse(){
        for (AbstractCourse course:arrayList ) {
            course.startCourse();
            course.conductClass();
            if (course instanceof Onlineable){
                ((Onlineable) course).provideOnlineAccess();
            } else if (course instanceof Onsiteable) {
                ((Onsiteable) course).arrangeClassroom();
            }
        }
    }
}
