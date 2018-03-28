package ReservationProject;

//Imports:
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuPageBak extends JFrame implements ActionListener {

    //Colors:            
    Color lightGREEN = new Color(128, 255, 128);
    Color PINK = new Color(255, 128, 128);
    //BG:
    JLabel dessertBG = new JLabel(new ImageIcon(MenuPage.class.getResource("DessertBG.jpg")));
    JLabel maindishBG = new JLabel(new ImageIcon(MenuPage.class.getResource("MainDishBG.png")));
    JLabel appetizersBG = new JLabel(new ImageIcon(MenuPage.class.getResource("AppetizersBG.png")));
    JLabel beveragesBG = new JLabel(new ImageIcon(MenuPage.class.getResource("BeveragesBG.png")));
    //Buttons
    JButton btnBack = new JButton("Back");

    public MenuPageBak() {
        btnBack.setBounds(515, 2, 75, 18);
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                WelcomeScreen welcome = new WelcomeScreen();
                welcome.run();
                dispose();
            }
        });
        add(btnBack);

        JPanel Appetizers = new JPanel();
        Appetizers.add(appetizersBG);
        Appetizers.setLayout(null);
        appetizersBG.setBounds(0, 0, 590, 470);

        //Labels
        JTextArea taAppetizers = new JTextArea("APPETIZERS\n\n\n\n"
                + "LUNCH\n\n\n"
                + "Vegetable Dumplings £7\n"
                + "Six steamed Chinese vegetable dumplings served with two dipping sauces\n\n"
                + "Fresh Squid Salad £9\n"
                + "Fresh Squid marinated in garlic, lemons, fresh Italian parsley and extra virgin olive oil\n\n"
                + "Swedish Shrimp Salad £11\n"
                + "Served with lettuce, tomato, yellow asparagus, hard boiled egg in a sweet chill dressing\n\n"
                + "Three Crostini's £7\n"
                + "Brushetta, Olive Tapanade and Mushroom & Goat cheese\n\n"
                + "Baked Potato £7\n"
                + "Served with Shrimp & Crab Salad or Curry Chicken Salad\n\n"
                + "Chicken Wrap £8\n"
                + "Grilled Chicken, carrots, scallion and peanut sauce in a tortilla wrap.\n\n"
                + "Tuna Nicoise Ficelles £7\n"
                + "Fresh chunks of tuna, egg slices, tomatoes, red leaf lettuce and black olives\n\n"
                + "Soup\n\n\n"
                + "small £7 large £9\n\n"
                + "Corn Soup\n\n"
                + "Mushroom Soup\n"
                + "Chicken Soup\n"
                + "Asparagus soup\n"
                + "Fish Soup\n"
                + "With saffron, salmon, fresh mussels, claims and lobster meat\n\n\n"
                + "Salads\n\n\n"
                + "Small Mixed Green Salad £6\n"
                + "With house dressing\n\n"
                + "Spinach, mushrooms, red onion, yellow peppers and smoked bacon £9\n"
                + "Served with a warm mustard - bacon vinaigrette\n\n"
                + "West Coast Salad £12\n"
                + "Shrimp, crab meat, mussels, green peas, yellow asparagus, tomatoes, mushrooms, green leaf and iceberg lettuce\n\n"
                + "Flank Steak Salad £11\n"
                + "Thin slices of flank steak marinated in an Asian dressing and served with mesclun salad and fresh mango\n\n"
                + "Vegetarian Salad £11\n"
                + "Spinach, mushrooms, roasted peppers, carrots, eggplant, squash topped with olives and served warm with a lemon - tomato vinaigrette\n\n\n"
                + "Sandwiches\n\n\n"
                + "Shrimp (open face) £7\n"
                + "Swedish Shrimp, tomato, hard boiled egg, cucumber, lemon aioli and topped with fresh dill, served on white bread\n\n"
                + "Meatballs (open face) £7\n"
                + "Swedish Meatballs and pickled beat salad, served on pumpernickel bread\n\n"
                + "Turkey Wrap £6\n"
                + "Fresh sliced honey turkey, green lettuce, roasted peppers, sprouts and feta cheese wrapped in a tortilla\n\n"
                + "Egg Salad & Tuna Salad £6\n"
                + "Two classics!\n"
                + "Warm Ham and Pineapple £7\n"
                + "Served with cheese, mixed greens and sweet chili dressing\n\n"
                + "Tomato and Mozzarella £6\n"
                + "Served in French Baguette\n\n"
                + "*Today's Lunch Special £13\n"
                + "Including a small salad and fresh baked bread\n\n"
                + "Meat: Red Curry Chicken\n"
                + "With Basmati rice and fresh steamed broccoli  or\n\n"
                + "Fish: Grilled Honey Mustard Salmon\n"
                + "With red roasted potatoes\n\n"
                + "Pasta: Linguine\n"
                + "with fresh pesto sauce\n\n\n\n\n"
                + "DINNER\n\n\n\n"
                + "Small Mixed Green Salad £6\n"
                + "Served with house dressing\n"
                + "Mushroom Sauté Torte £7\n"
                + "Served warm with goat cheese\n"
                + "Fresh Squid Salad £11\n"
                + "Fresh Squid marinated in garlic, lemons, fresh Italian parsley and extra virgin olive oil\n"
                + "Spicy Fresh Tuna Tartar £9\n"
                + "Fresh Tuna rolled in cucumber and topped with a spicy chili sesame seed dressing\n"
                + "Chicken Skewers £8\n"
                + "Served with a tropical peanut dipping sauce\n"
                + "Prosciutto and Avocado Salad £8\n"
                + "Served with Frisee and Arugula Salad in a lemon vinaigrette");

        JPanel Beverages = new JPanel();
        Beverages.add(beveragesBG);
        
        Appetizers.add(taAppetizers);

        JTextArea taBeverages = new JTextArea("Beverages\n"
                + "Coffee \n"
                + "Espresso £10\n"
                + "Cappucino £10\n"
                + "Caramel Macchiato £10\n"
                + "Tea \n"
                + "Green Tea £10\n"
                + "Earl Grey Tea £10\n"
                + "English Tea £10\n"
                + "Blue Lemon Iced Tea £8\n"
                + "Wines \n"
                + "White Wine\n"
                + "Argentina £ 30\n"
                + "2011 Colores del Sol, San Juan-Coyo 28.\n"
                + "Portugal £30\n"
                + "2012 Anjos de Portugal, Vinho Verde 25.\n"
                + "Spain £30\n"
                + "2011 Licia, Rias Baixas 33.\n"
                + "Chardonnay £40\n"
                + "2009 Macon-Lugny, Les Charmes, Burgundy 34.\n"
                + "2009 Baileyana, Firepeak Vineyard, Edna Valley 37.\n"
                + "2011 Michael & David, 7 Heavenly, Lodi 38.\n"
                + "2008 Chablis, Domaine A’dair, Gilles & Natalie Fèvre, Burgundy 44.\n"
                + "(a D.C. Flynt Selection)\n"
                + "2009 Macon, Chanson, Viré-Clessé, Burgundy 48.\n"
                + "2011 Stags’ Leap, Napa 50.\n"
                + "Red Wine\n"
                + "Spain £40\n"
                + "2007 Sierra Cantabria, Crianza, Rioja 32.\n"
                + "2009 Finca Antigua, Crianza, La Mancha 35.\n"
                + "2010 Protos, Tinto Fino, Ribera del Duero, Rioja 37.\n"
                + "2008 Obalo, Crianza, Abalos, Rioja 38.\n"
                + "Italy £30\n"
                + "2009 Chianti, Fattoria Bibbiano, Poggio Vignoso 33.\n"
                + "2007 Allegrini, Palazzo Della Torre, Veneto 47.\n"
                + "2006 Amarone della Valpoicella, Zenato, Classico 108.\n"
                + "2004 Barolo, Cerretto, Bricco Rocche, Prapó 125.");

        Beverages.setLayout(null);
        beveragesBG.setBounds(0, 0, 590, 470);

        JPanel MainDish = new JPanel();
        MainDish.add(maindishBG);
        MainDish.setLayout(null);
        maindishBG.setBounds(0, 0, 590, 470);
        
      

        JTextArea taMainDish = new JTextArea("MAINDISH"
                + "LUNCH"
                + "Short Ribs of Beef £15   \n"
                + "Served with mango chutney and mashed sweet potatoes with a port wine sauce  or\n"
                + "Swedish Meatballs £9  \n"
                + "Served with mashed potatoes, lingon berries and pickled cucumbers\n"
                + "Smoked Salmon Panini £9  \n"
                + "With a Swedish Remoulade\n"
                + "Tuna and Salmon Burger £12  \n"
                + "Served on a sourdough roll with Pineapple Chutney\n"
                + "Seared Halibut with fresh Spring vegetables £15  \n"
                + "Served with a Tomato - Cucumber Feta Salad\n"
                + "Italian Sausage and Wild Mushroom Risotto £13\n"
                + "Home made Butternut Squash Ravioli's £13  \n"
                + "Served in a white wine sauce with fresh spinach\n"
                + "Pan-Roasted Chicken with Cognac-Peppercorn Sauce £15  \n"
                + "Served with fresh broccoli and mashed potatoes\n"
                + "Spiced Pork Tenderloin with Pineapple-Avocado Salsa £15  \n"
                + "Served with black beans and rice\n"
                + "Turkey Burger with Chipotle-Chili Tartar Sauce £12  \n"
                + "Served on a bun with arugula, red onion and plum tomatoes"
        );

        JPanel Desserts = new JPanel(); 
        Desserts.add(dessertBG);
        Desserts.setLayout(null);
        dessertBG.setBounds(0, 0, 590, 470);

        JTabbedPane MenuPages = new JTabbedPane();
        MenuPages.setBackground(Color.LIGHT_GRAY);
        add(MenuPages);
        MenuPages.setBounds(1, 1, 590, 470);
        MenuPages.addTab("Appetizers", Appetizers);
        MenuPages.addTab("Main Dish", MainDish);
        MenuPages.addTab("Beverages", Beverages);
        MenuPages.addTab("Desserts", Desserts);
    }

    public static void main(String[] args) {
        MenuPage m = new MenuPage();
        m.run();
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public void run() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setTitle("Menu");
        pack();
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}