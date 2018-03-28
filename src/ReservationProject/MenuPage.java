package ReservationProject;

//Imports:
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class MenuPage extends JFrame implements ActionListener {

    //Objects:
    ForkFrame ff = new ForkFrame();
    //BG:
    JLabel dessertBG = new JLabel(new ImageIcon(MenuPage.class.getResource("DessertBG.jpg")));
    JLabel maindishBG = new JLabel(new ImageIcon(MenuPage.class.getResource("MainDishBG.png")));
    JLabel appetizersBG = new JLabel(new ImageIcon(MenuPage.class.getResource("AppetizersBG.png")));
    JLabel beveragesBG = new JLabel(new ImageIcon(MenuPage.class.getResource("BeveragesBG.png")));
    //Buttons
    JButton btnBack = new JButton("Back");

    //String
    String strDefault = "Welcome to SilvərPlĕte's Menu filled with delicious food";

    Font serif = new Font("SansSerif", Font.PLAIN, 14);

    public MenuPage() {
        setLayout(null);
        btnBack.setBounds(515, 2, 75, 18);
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                WelcomeScreen welcome = new WelcomeScreen();
                welcome.run();
                ff.dispose();
                setVisible(false);
            }
        });
        btnBack.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Return to the Welcome Screen");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        add(btnBack);

        JTextArea taAppetizers = new JTextArea("APPETIZERS\n\n\n"
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

        JPanel Appetizers = new JPanel();
        Appetizers.setLayout(null);
        Appetizers.add(taAppetizers);
        Appetizers.setBounds(0, 0, 590, 490);
        appetizersBG.setBounds(0, 0, 590, 490);

        taAppetizers.setForeground(Color.WHITE);
        taAppetizers.setBackground(new Color(0, 0, 0, 0));
        taAppetizers.setEditable(false);
        taAppetizers.setFont(serif);
        taAppetizers.setLineWrap(true);
        taAppetizers.setWrapStyleWord(true);
        taAppetizers.setFocusable(false);

        JScrollPane spAppetizers = new JScrollPane(taAppetizers);
        Appetizers.add(spAppetizers);
        spAppetizers.setBorder(BorderFactory.createEmptyBorder());
        spAppetizers.setBackground(new Color(0, 0, 0, 0));
        spAppetizers.setBounds(3, 3, 580, 440);
        Appetizers.add(appetizersBG);

        spAppetizers.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                appetizersBG.repaint();
            }

        });

        JTextArea taBeverages = new JTextArea("BEVERAGES\n\n\n"
                + "Coffee\n\n"
                + "Espresso £10\n"
                + "Cappucino £10\n"
                + "Caramel Macchiato £10\n\n\n"
                + "Tea\n\n"
                + "Green Tea £10\n"
                + "Earl Grey Tea £10\n"
                + "English Tea £10\n"
                + "Blue Lemon Iced Tea £8\n\n\n"
                + "Wines\n\n"
                + "White Wine\n\n"
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
                + "2008 Chablis, Domaine A’dair, Gilles & Natalie Fèvre, Burgundy 44\n"
                + "(a D.C. Flynt Selection)\n"
                + "2009 Macon, Chanson, Viré-Clessé, Burgundy 48.\n"
                + "2011 Stags’ Leap, Napa 50.\n\n"
                + "Red Wine\n\n"
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

        JPanel Beverages = new JPanel();
        Beverages.add(taBeverages);
        Beverages.add(beveragesBG);
        Beverages.setBounds(0, 0, 590, 470);
        Beverages.setLayout(null);
        beveragesBG.setBounds(0, 0, 590, 470);

        //Labels
        taBeverages.setForeground(Color.BLACK);
        taBeverages.setBackground(new Color(0, 0, 0, 0));
        taBeverages.setBounds(15, 30, 500, 350);

        JPanel MainDish = new JPanel();
        MainDish.add(maindishBG);
        MainDish.setLayout(null);
         maindishBG.setBounds(0, 0, 590, 470);

        JTextArea taMainDish = new JTextArea("MAINDISH\n\n\n"
                + "LUNCH\n\n"
                + "Short Ribs of Beef £15\n"
                + "Served with mango chutney and mashed sweet potatoes with a port wine sauce  or\n"
                + "Swedish Meatballs £9\n"
                + "Served with mashed potatoes, lingon berries and pickled cucumbers\n"
                + "Smoked Salmon Panini £9\n"
                + "With a Swedish Remoulade\n"
                + "Tuna and Salmon Burger £12\n"
                + "Served on a sourdough roll with Pineapple Chutney\n"
                + "Seared Halibut with fresh Spring vegetables £15\n"
                + "Served with a Tomato - Cucumber Feta Salad\n"
                + "Italian Sausage and Wild Mushroom Risotto £13\n"
                + "Home made Butternut Squash Ravioli's £13\n"
                + "Served in a white wine sauce with fresh spinach\n"
                + "Pan-Roasted Chicken with Cognac-Peppercorn Sauce £15\n"
                + "Served with fresh broccoli and mashed potatoes\n"
                + "Spiced Pork Tenderloin with Pineapple-Avocado Salsa £15\n"
                + "Served with black beans and rice\n"
                + "Turkey Burger with Chipotle-Chili Tartar Sauce £12\n"
                + "Served on a bun with arugula, red onion and plum tomatoes"
                
                +"DINNER\n\n"
                + "Fish\n\n" +
                "Fish Soup £9  \n" +
                "With saffron, salmon, fresh mussels, clams and lobster meat\n\n" +
                "Roasted Cod with Spinach and Mushrooms £14  \n" +
                "Served with red roasted potatoes\n\n" +
                "Filet of Mackerel £14  \n" +
                "Grilled filet of Mackerel, served with a beet and potato roulade\n\n" +
                "Grilled Atlantic Salmon £14  \n" +
                "Served with sautéed onions, leeks, artichokes and potatoes in a lemon juice\n\n" +
                "Shrimp Charmoula £16  \n" +
                "Moroccan Shrimp Skewers marinated in an aromatic herb-and-oil mixture before grilling\n\n" +
                "Pasta\n\n" +
                "Angel hair pasta with fresh roma tomatoes, garlic and fresh basil £12  \n" +
                "Served in a light white wine sauce with crushed red peppers\n\n" +
                "Vegetarian Lasagna £12\n" +
                "Home made Butternut Squash Ravioli's £14  \n" +
                "Served in a white wine sauce with fresh spinach and roma tomatoes\n\n" +
                "Meat\n" +
                "Swedish Meatballs £13  \n" +
                "With mashed potatoes, lingon berries and pickled cucumbers\n\n" +
                "Mango Chutney Filet Tenderloin £15  \n" +
                "Filet Tenderloins with mango chutney and steamed broccoli\n\n" +
                "Duck Breast with orange, honey and champagne sauce £16  \n" +
                "Seared duck breast with a sweet sizzling champagne sauce. Served with white beans.\n\n" +
                "Rosemary and Garlic Lamb Chops £17  \n" +
                "Grilled Lamb chops with red roasted potatoes and red wine sauce\n\n" +
                "Pepper Steak £18  \n" +
                "Beef Tenderloin with black pepper and cognac sauce. Served with fried potatoes.\n\n" +
                "Barbecue Beef Ribs £15  \n" +
                "Served with baked beans and fried potatoes\n\n" +
                "Vegetarian\n\n" +
                "Steamed mixed vegetables with brown rice £11  \n" +
                "Steamed and sautéed with brown rice and soy sauce\n\n" +
                "Eggplant Manicotti with ricotta, asiago and spinach filling £12  \n" +
                "Sautéed eggplant rolled and stuffed with ricotta, asiago and fresh spinach");
                
                JPanel Maindish = new JPanel();
                Maindish.add(taMainDish);
                Maindish.add(maindishBG);
                Maindish.setBounds(0, 0, 590, 470);
                Maindish.setLayout(null);
                maindishBG.setBounds(0, 0, 590, 470);
                
                //Labels
                   taMainDish.setForeground(Color.BLACK);
                   taMainDish.setBackground(new Color(0, 0, 0, 0));
                   taMainDish.setBounds(15, 30, 500, 350);
                    
        JPanel Desserts = new JPanel();
        Desserts.add(dessertBG);
        Desserts.setLayout(null);
        dessertBG.setBounds(0, 0, 590, 470);
        
        JTextArea taDesserts = new JTextArea("LUNCH"
                + "Dessert\n\n" +
            "Chocolate Pudding £6 \n" +
            "With whipped cream\n" +
            "Caramel-Walnut Torte £8\n" +
            "Chocolate Cake £8\n" +
            "With whipped cream and Raspberry sauce\n\n" +
            "Fresh Fruit and Berry Salad £5\n" +
            "Ice-cream £8\n\n" +
            "Today's Ice-cream. Ask your waiter.\n" +
            "Assorted Cookie and Pastry Platters £12\n" +
            "**Ask your waiter for today's selections" +
            
            "DINNER\n\n"+
            "Chocolate Pudding £6 \n" +
            "With whipped cream\n" +
            "Blueberry Cobbler  £6\n" +
            "Served with vanilla Ice-cream\n" +
            "Whole grilled Apples with Vanilla Sauce £6 \n" +
            "Warm glazed green apples served with a cold vanilla sauce\n" +
            "Rhubarb Compote  £6\n" +
            "Served with Coconut Ice-cream\n" +
            "Caramel-Walnut Torte £8\n" +
            "Linda's three layer Chocolate Cake £8  \n" +
            "Served with whipped cream and raspberry sauce\n" +
            "Sparkling Lemon Cream with Biscotti and fresh berries £6 \n" +
            "A chilled sparkling wine and lemon sorbet drink served with Biscotti and fresh berries\n" +
            "Fresh Fruit and Berry Salad £6\n" +
            "Ice-cream  £8\n" +
            "Today's Ice-cream. Ask your waiter.\n" +
            "Assorted Cookie and Pastry Platters £12");

        JTabbedPane MenuPages = new JTabbedPane();
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
        setResizable(false);
        setTitle("Menu");
        pack();
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        runFork();
    }

    public void runFork() {
        ff.run();
        ff.setBounds(this.getLocationOnScreen().x - 158, this.getLocationOnScreen().y - 100, 600, 90);
    }
}
