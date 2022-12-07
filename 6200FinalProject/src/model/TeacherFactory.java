package model;


import java.util.Scanner;

public class TeacherFactory extends PersonFactory
{

    private static TeacherFactory singleton = null;

    public TeacherFactory()
    {
    }

    public static TeacherFactory getInstance()
    {
        if (singleton == null)
            singleton = new TeacherFactory();
        return singleton;
    }

    @Override
    public Person getObject(String csv)
    {
        // Format: "[name],[gender],[age],[credits]
        try
        {
            Scanner scanner = new Scanner(csv);
            scanner.useDelimiter(",");

            String name = scanner.next();
            String gender = scanner.next();
            int age = scanner.nextInt();
            int credits = scanner.nextInt();
            return new Teacher(name, gender, age, credits);
        } catch (Exception e)
        {
            System.err.printf("Teacher CSV creation error - [%s]\n", csv);
            return null;
        }
    }
}