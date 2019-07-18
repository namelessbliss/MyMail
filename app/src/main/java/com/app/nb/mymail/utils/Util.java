package com.app.nb.mymail.utils;

import com.app.nb.mymail.models.Mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {

    public static String[] colors = {"#a1dd70", "#ffba92", "#38470b", "#cba1d2", "#ff9c91", "#50b6bb",
            "#ffba92", "#ff8080", "#d3f6f3", "#32ff6a", "#f0e3c4", "#a64942", "#58b368", "#9ea9f0", "#f58b54"};

    public static List<Mail> getData() {
        return new ArrayList<Mail>() {{
            add(new Mail("Presupuesto 2000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "Adolfo"));
            add(new Mail("Cena con el Jefe", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Conviertete e millonario", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Ganaste un Oculus VR", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Tarea de POO", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Archivos de la semana 7", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Adopta un cachorro", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Campaña de deudores", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Feliz navidad", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "nb"));
            add(new Mail("Llena este formulario en 5 minutos y gana 200 dolares", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim neque a auctor luctus. Suspendisse potent", "Alf"));

        }};
    }

    public static String getRandomColor() {
        int randomNumber = new Random().nextInt(colors.length);

        return colors[randomNumber];
    }
}
