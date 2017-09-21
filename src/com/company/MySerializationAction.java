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

  static Journal readJournalStudent(String fileName) throws IOException,
          ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream(fileName)
    );
    Group group = (Group) ois.readObject();
    return group;
  }
}
