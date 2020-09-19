import Commands.*;
import This.FileWork;
import This.Inputting;
import This.OrganizationData;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        /*String temp = System.getenv().get("TEMP");
        System.out.println(temp);

         */
        Gen<Integer> iOb = new Gen<>(77);
        OrganizationData organizationData = new OrganizationData();
        final String nameOfEnvVar = "F://example.xml";
        String dataPath = System.getenv(nameOfEnvVar);

//        if (dataPath == null) {
//            System.out.println("ERROR\nYou need to set environment variable(LAB_DATA_PATH) with path to you data file(.xml)");
//            System.out.println("Exit...");
//            System.exit(0);
//        } else {
//            System.out.println("Getting data from file " + dataPath + " ...");
//            try {
//                organizationData = FileWork.readFromXML(dataPath);
//                System.out.println("Got data");
//
//            } catch (JAXBException e) {
//                e.printStackTrace();
//                System.out.println("error while reading data from XML");
//                System.out.println("Exit...");
//                System.exit(0);
//            }

        Help helpCommand = new Help();
        Info infoCommand = new Info();
        Exit exitCommand = new Exit();
        Show showCommand = new Show();
        Save saveCommand = new Save();
        AddNew addNewCommand = new AddNew();
        UpdateId updateCommand = new UpdateId();
        RemoveById removeByIdCommand = new RemoveById();
        Clear clearCommand = new Clear();
        ExecuteScriptFileName executeScriptCommand = new ExecuteScriptFileName();
        Head headCommand = new Head();
        RemoveFirst removeFirstCommand = new RemoveFirst();
        RemoveGreater removeGreaterCommand = new RemoveGreater();
        AverageOfEmployeesCount averageOfEmployeesCountCommand = new AverageOfEmployeesCount();
        PrintFieldDescendingPostalAddress printFieldDescendingPostalAddress = new PrintFieldDescendingPostalAddress();
        FilterStartsWithName filterStartsWithName = new FilterStartsWithName();



//        String fileData = "execute_script F:\\example.txt";
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("F:\\example.txt");
//            fos.write(fileData.getBytes());
//            fos.flush();
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        while (true) {
            System.out.println("Enter you action, use >help to get the list of all commands");
            String action = Inputting.readLine();
            if (!action.isEmpty()) {
                CommandExecutor.execute(action, organizationData);
                System.out.println();
            }
        }
    }
}
