package model;


import java.util.Scanner;

public class StudentFactory extends PersonFactory
{

    private static StudentFactory singleton = null;

    private StudentFactory()
    {
    }

    public static StudentFactory getInstance()
    {
        if (singleton == null)
            singleton = new StudentFactory();
        return singleton;
    }

    @Override
    public Person getObject(String csv)
    {
        // Format: "[name],[age],[parentName],[address],[phone]"

        try
        {
            Scanner scanner = new Scanner(csv);
            scanner.useDelimiter(",");

            String name = scanner.next();
            int age = scanner.nextInt();
            String parentName = scanner.next();
            String address = scanner.next();
            long phone = scanner.nextLong();

            return new Student(name, age, parentName, address, phone);
        } catch (Exception e)
        {
            System.err.printf("Student CSV creation error - [%s]\n", csv);
            return null;
        }
    }
}