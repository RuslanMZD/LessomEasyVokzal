package lesson19;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParser {
    public static void main(String[] args) {
        File file = new File("/home/ruslan/Desktop/LessonEasyVokzal/src/test.xml");
        Root root = new Root();

        NodeList childPeople = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = null;

        try {
            document = factory.newDocumentBuilder().parse(file);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        Node firstNode = document.getFirstChild(); // получили первую ноду
      //  System.out.println(firstNode.getNodeName());

        NodeList nodeList = firstNode.getChildNodes(); // получили массив остальных нод
        String nameFile = null;
        String nameFile1 = null;

        List<People> list = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            if(nodeList.item(i).getNodeType()!=Node.ELEMENT_NODE){// определяет тип ноды , для того чтобы отбросить текст и оставить только элименты
                continue;

            }
       //     System.out.println(nodeList.item(i).getNodeName());

            switch (nodeList.item(i).getNodeName()){
                case "name":{
                    nameFile = nodeList.item(i).getTextContent();
                 //   nameFile1 = nodeList.item(i).getNodeValue();
                    break;
                }
                case "people":{
                     childPeople = nodeList.item(i).getChildNodes();
                     break;

                }

            }

            root.setName(nameFile);

//            if(childPeople.item(i)==null){
//                return;
//            }

                    }
        String namePeople = null;
        int agePeople = 0;
        NodeList childNodeElement = null;
        for (int i = 0; i < childPeople.getLength(); i++) {
            if(childPeople.item(i).getNodeType()!=Node.ELEMENT_NODE){
               continue;
            }

            if(childPeople.item(i).getNodeName().equals("element")){
                 childNodeElement = childPeople.item(i).getChildNodes();
                People people = new People();
                 for (int j = 0; j < childNodeElement.getLength(); j++) {
                    if(childNodeElement.item(j).getNodeType()!=Node.ELEMENT_NODE){
                        continue;
                    }
                    switch (childNodeElement.item(j).getNodeName()){
                        case "name":
                           namePeople = childNodeElement.item(j).getTextContent();
                       //     System.out.println(namePeople);
                            break;
                        case "age":
                           agePeople = Integer.parseInt(childNodeElement.item(j).getTextContent());
                          //  System.out.println(agePeople);
                            break;
                    }


                }

            }

            people.setAge(agePeople);
            people.setName(namePeople);
            list.add(people);
            root.setListPeolpe(list);
        }




    }
}
