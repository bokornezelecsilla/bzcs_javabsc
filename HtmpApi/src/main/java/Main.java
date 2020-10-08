import hu.training360.javase.htmlapi.containers.Div;
import hu.training360.javase.htmlapi.containers.Html;
import hu.training360.javase.htmlapi.containers.Ol;
import hu.training360.javase.htmlapi.containers.OlLi;
import hu.training360.javase.htmlapi.controllers.Button;

public class Main {
    public static void main(String[] args)
    {

        Html root = new Html();

        Div div = new Div("D1", root);
        Div div2 = new Div("D2", div);

        Button button = new Button("1",  "", "Button", div);

        Button button2 = new Button("2",  "", "Button2", div2);

        Ol ol = new Ol("O1",div2);
        OlLi li1 = new OlLi("li1", "List element 1", ol);
        OlLi li2 = new OlLi("li2", "List element 2", ol);
        OlLi li3 = new OlLi("li3", "List element 3", ol);


        root.addChild(div);
        div.addChild(button);
        div2.addChild(button2);
        div.addChild(div2);
        div2.addChild(ol);
        ol.addChild(li1);
        ol.addChild(li2);
        ol.addChild(li3);


        System.out.println(root.getHtml());
      //  System.out.println(button.getHtmlAsString());
    }
}

/*
<!DOCTYPE html><html><body><button type="button" onclick="">Button</button>
<!DOCTYPE html><html><body><button type="button" onclick="">Button</button></body></html>
*/
