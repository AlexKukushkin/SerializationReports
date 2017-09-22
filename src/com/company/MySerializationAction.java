package com.company;
import java.io.*;


public class MySerializationAction {
  static Group readGroup(String fileName) throws IOException,
                                      ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(
      new FileInputStream(fileName)
    );
    Group group = (Group) ois.readObject();
    return group;
  }

  static void serializeGroup(Group group) throws IOException {
    File file = new File("group.txt");
    // fos = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream(file)
    );
    oos.writeObject(group);
  }

  static Journal readJournalLesson(String fileName) throws IOException,
          ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream(fileName)
    );
    Journal journal = (Journal) ois.readObject();
    return journal;
  }
  static void serializeJournalLesson(Journal journal) throws IOException {
    File file = new File("journal_Lesson.txt");
    ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(file)
    );
    oos.writeObject(journal);
  }


  static Journal readJournalGroup(String fileName) throws IOException,
          ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream(fileName)
    );
    Journal journal = (Journal) ois.readObject();
    return journal;
  }
  static void serializeJournalGroup(Journal journal) throws IOException {
    File file = new File("journal_Group.txt");
    ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(file)
    );
    oos.writeObject(journal);
  }

  static Journal readJournalStudent(String fileName) throws IOException,
          ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream(fileName)
    );
    Journal journal = (Journal) ois.readObject();
    return journal;
  }
  static void serializeJournalStudent(Journal journal) throws IOException {
    File file = new File("journal_Student.txt");
    ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(file)
    );
    oos.writeObject(journal);
  }
}
