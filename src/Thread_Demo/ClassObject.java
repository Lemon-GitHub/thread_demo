package Thread_Demo;

public class ClassObject {
    public static void main(String[] args) {
        // 类也是Java中的对象
        Class <ClassObject> classObjectClass = ClassObject.class;
        ClassObject object = new ClassObject();
        Class classObjectClass2 = object.getClass();
    }
}
