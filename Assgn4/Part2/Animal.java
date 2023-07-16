import java.awt.*;

public class Animal extends Parts {

    int a1[] = new int[10];
    int a2[] = new int[10];

    public void init() {
        setBackground(Color.green);
        originX = (getX() + getWidth()) / 2;
        originY = (getY() + getHeight()) / 2;
        B1 = new Button("zoomin");
        add(B1);
        B1.addActionListener(this);

        B2 = new Button("zoomout");
        add(B2);
        B2.addActionListener(this);

        // B3 = new Button("Animal 1");
        // add(B3);
        // B3.addActionListener(this);

        // B4 = new Button("Animal 2");
        // add(B4);
        // B4.addActionListener(this);

        B6 = new Button("A1.BKSZ");
        add(B6);
        B6.addActionListener(this);

        B7 = new Button("A1.BKT");
        add(B7);
        B7.addActionListener(this);

        B8 = new Button("A1.ESH");
        add(B8);
        B8.addActionListener(this);

        B9 = new Button("A1.BDSP");
        add(B9);
        B9.addActionListener(this);

        B10 = new Button("A1.BDH");
        add(B10);
        B10.addActionListener(this);

        B11 = new Button("A1.TSH");
        add(B11);
        B11.addActionListener(this);

        B12 = new Button("A1.LGSP");
        add(B12);
        B12.addActionListener(this);

        B13 = new Button("A1.LGH");
        add(B13);
        B13.addActionListener(this);

        B14 = new Button("A1.ASP");
        add(B14);
        B14.addActionListener(this);

        B15 = new Button("A1.AH");
        add(B15);
        B15.addActionListener(this);

        B16 = new Button("A2.BKSZ");
        add(B16);
        B16.addActionListener(this);

        B17 = new Button("A2.BKT");
        add(B17);
        B17.addActionListener(this);

        B18 = new Button("A2.ESH");
        add(B18);
        B18.addActionListener(this);

        B19 = new Button("A2.BDSP");
        add(B19);
        B19.addActionListener(this);

        B20 = new Button("A2.BDH");
        add(B20);
        B20.addActionListener(this);

        B21 = new Button("A2.TSH");
        add(B21);
        B21.addActionListener(this);

        B22 = new Button("A2.LGSP");
        add(B22);
        B22.addActionListener(this);

        B23 = new Button("A2.LGH");
        add(B23);
        B23.addActionListener(this);

        B24 = new Button("A2.ASP");
        add(B24);
        B24.addActionListener(this);

        B25 = new Button("A2.AH");
        add(B25);
        B25.addActionListener(this);

    }

    public void paint(Graphics g) {
        // int min0 = 0;
        // int max0 = 1;
        // = (int) Math.floor(Math.random() * (max0 - min0 + 1) + min0);
        for (int i = originY; i >= 0; i -= j / 2) {
            g.drawLine(0, i, getWidth(), i);
        }
        for (int i = originY; i <= getHeight(); i += j / 2) {
            g.drawLine(0, i, getWidth(), i);
        }
        for (int i = originX; i >= 0; i -= j / 2) {
            g.drawLine(i, 0, i, getHeight());
        }
        for (int i = originX; i <= getWidth(); i += j / 2) {
            g.drawLine(i, 0, i, getHeight());
        }
        g.setColor(Color.RED);
        g.drawLine(0, originY, getWidth(), originY);
        g.drawLine(originX, 0, originX, getHeight());

        // // Parent 1
        // Animal1(g, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        // // Parent 2
        // Animal2(g, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        // Animal1(g, bksz1, bkt1, esh1, bdsp1, bdh1, tsh1, lgsp1, lgh1, asp1, ah1);
        // Animal2(g, bksz2, bkt2, esh2, bdsp2, bdh2, tsh2, lgsp2, lgh2, asp2, ah2);
        a1[0] = bksz1;
        a1[1] = bkt1;
        a1[2] = esh1;
        a1[3] = bdsp1;
        a1[4] = bdh1;
        a1[5] = tsh1;
        a1[6] = lgsp1;
        a1[7] = lgh1;
        a1[8] = asp1;
        a1[9] = ah1;

        a2[0] = bksz2;
        a2[1] = bkt2;
        a2[2] = esh2;
        a2[3] = bdsp2;
        a2[4] = bdh2;
        a2[5] = tsh2;
        a2[6] = lgsp2;
        a2[7] = lgh2;
        a2[8] = asp2;
        a2[9] = ah2;

        
        Animal1(g, a1[0], a1[1], a1[2], a1[3], a1[4], a1[5], a1[6], a1[7], a1[8], a1[9]);
        Animal2(g, a2[0], a2[1], a2[2], a2[3], a2[4], a2[5], a2[6], a2[7], a2[8], a2[9]);
        Child1(g);
    }

    public void Animal1(Graphics g, int bksz, int bkt, int esh, int bdsp, int bdh, int tsh, int lgsp, int lgh, int asp,
            int ah) {
        // head
        head(g, -93, 25, 8);
        // eyes
        eyes(g, -94, 27, 2);
        // beak
        beak(g, -99, 27, bksz, bkt);
        // ear
        ear(g, -87, 33, esh);
        // body
        body(g, -75, 5, bdsp, bdh);
        // tail
        tail(g, -57, -3, tsh);
        // leg 1
        armsAndLegs(g, -63, -18, 2, lgsp, lgh, 1);
        // leg 2
        armsAndLegs(g, -74, -18, 2, lgsp, lgh, 1);
        // Feet 1
        armsAndLegs(g, -85, -40, 1, lgsp, lgh, 0);
        // Feet 2
        armsAndLegs(g, -70, -40, 1, lgsp, lgh, 0);
        // toes 1
        armsAndLegs(g, -92, -40, 0, 0, 0, 0);
        armsAndLegs(g, -90, -43, 0, 0, 0, 0);
        armsAndLegs(g, -88, -45, 0, 0, 0, 0);
        // toes 2
        armsAndLegs(g, -77, -40, 0, 0, 0, 0);
        armsAndLegs(g, -75, -43, 0, 0, 0, 0);
        armsAndLegs(g, -73, -45, 0, 0, 0, 0);
        // arms 1
        armsAndLegs(g, -95, 10, 2, asp, ah, 0);
        // arms 2
        armsAndLegs(g, -93, 0, 2, asp, ah, 0);
        // hand 1
        armsAndLegs(g, -120, 18, 1, asp, ah, 0);
        // hand 2
        armsAndLegs(g, -120, 8, 1, asp, ah, 0);
        // fingers 1
        armsAndLegs(g, -127, 18, 0, 0, 0, 0);
        armsAndLegs(g, -125, 21, 0, 0, 0, 0);
        armsAndLegs(g, -125, 15, 0, 0, 0, 0);
        // fingers 2
        armsAndLegs(g, -127, 8, 0, 0, 0, 0);
        armsAndLegs(g, -125, 11, 0, 0, 0, 0);
        armsAndLegs(g, -125, 5, 0, 0, 0, 0);
    }

    public void Animal2(Graphics g, int bksz, int bkt, int esh, int bdsp, int bdh, int tsh, int lgsp, int lgh, int asp,
            int ah) {
        // head
        head(g, -3, 25, 8);
        // eyes
        eyes(g, -4, 27, 2);
        // beak
        beak(g, -9, 27, bksz, bkt);
        // ear
        ear(g, 3, 33, esh);
        // body
        body(g, 15, 5, bdsp, bdh);
        // tail
        tail(g, 33, -3, tsh);
        // leg 1
        armsAndLegs(g, 27, -18, 2, lgsp, lgh, 1);
        // leg 2
        armsAndLegs(g, 16, -18, 2, lgsp, lgh, 1);
        // Feet 1
        armsAndLegs(g, 5, -40, 1, lgsp, lgh, 0);
        // Feet 2
        armsAndLegs(g, 20, -40, 1, lgsp, lgh, 0);
        // toes 1
        armsAndLegs(g, -2, -40, 0, 0, 0, 0);
        armsAndLegs(g, 0, -43, 0, 0, 0, 0);
        armsAndLegs(g, 2, -45, 0, 0, 0, 0);
        // toes 2
        armsAndLegs(g, 13, -40, 0, 0, 0, 0);
        armsAndLegs(g, 15, -43, 0, 0, 0, 0);
        armsAndLegs(g, 17, -45, 0, 0, 0, 0);
        // arms 1
        armsAndLegs(g, -5, 10, 2, asp, ah, 0);
        // arms 2
        armsAndLegs(g, -3, 0, 2, asp, ah, 0);
        // hand 1
        armsAndLegs(g, -30, 18, 1, asp, ah, 0);
        // hand 2
        armsAndLegs(g, -30, 8, 1, asp, ah, 0);
        // fingers 1
        armsAndLegs(g, -37, 18, 0, 0, 0, 0);
        armsAndLegs(g, -35, 21, 0, 0, 0, 0);
        armsAndLegs(g, -35, 15, 0, 0, 0, 0);
        // fingers 2
        armsAndLegs(g, -37, 8, 0, 0, 0, 0);
        armsAndLegs(g, -35, 11, 0, 0, 0, 0);
        armsAndLegs(g, -35, 5, 0, 0, 0, 0);
    }

    public void Child1(Graphics g) {
        int max01 = Math.max(a1[0], a2[0]);
        int min01 = Math.min(a1[0], a2[0]);
        int max02 = Math.max(a1[1], a2[1]);
        int min02 = Math.min(a1[1], a2[1]);
        int max03 = Math.max(a1[2], a2[2]);
        int min03 = Math.min(a1[2], a2[2]);
        int max04 = Math.max(a1[3], a2[3]);
        int min04 = Math.min(a1[3], a2[3]);
        int max05 = Math.max(a1[4], a2[4]);
        int min05 = Math.min(a1[4], a2[4]);
        int max06 = Math.max(a1[5], a2[5]);
        int min06 = Math.min(a1[5], a2[5]);
        int max07 = Math.max(a1[6], a2[6]);
        int min07 = Math.min(a1[6], a2[6]);
        int max08 = Math.max(a1[7], a2[7]);
        int min08 = Math.min(a1[7], a2[7]);
        int max09 = Math.max(a1[8], a2[8]);
        int min09 = Math.min(a1[8], a2[8]);
        int max10 = Math.max(a1[9], a2[9]);
        int min10 = Math.min(a1[9], a2[9]);
        int bksz = (int) Math.floor(Math.random() * (max01 - min01 + 1) + min01);
        int bkt = (int) Math.floor(Math.random() * (max02 - min02 + 1) + min02);
        int esh = (int) Math.floor(Math.random() * (max03 - min03 + 1) + min03);
        int bdsp = (int) Math.floor(Math.random() * (max04 - min04 + 1) + min04);
        int bdh = (int) Math.floor(Math.random() * (max05 - min05 + 1) + min05);
        int tsh = (int) Math.floor(Math.random() * (max06 - min06 + 1) + min06);
        int lgsp = (int) Math.floor(Math.random() * (max07 - min07 + 1) + min07);
        int lgh = (int) Math.floor(Math.random() * (max08 - min08 + 1) + min08);
        int asp = (int) Math.floor(Math.random() * (max09 - min09 + 1) + min09);
        int ah = (int) Math.floor(Math.random() * (max10 - min10 + 1) + min10);
        head(g, 87, 25, 8);
        // eyes
        eyes(g, 86, 27, 2);
        // beak
        beak(g, 81, 27, bksz, bkt);
        // ear
        ear(g, 93, 33, esh);
        // body
        body(g, 105, 5, bdsp, bdh);
        // tail
        tail(g, 123, -3, tsh);
        // leg 1
        armsAndLegs(g, 117, -18, 2, lgsp, lgh, 1);
        // leg 2
        armsAndLegs(g, 106, -18, 2, lgsp, lgh, 1);
        // Feet 1
        armsAndLegs(g, 95, -40, 1, lgsp, lgh, 0);
        // Feet 2
        armsAndLegs(g, 110, -40, 1, lgsp, lgh, 0);
        // toes 1
        armsAndLegs(g, 88, -40, 0, 0, 0, 0);
        armsAndLegs(g, 90, -43, 0, 0, 0, 0);
        armsAndLegs(g, 92, -45, 0, 0, 0, 0);
        // toes 2
        armsAndLegs(g, 103, -40, 0, 0, 0, 0);
        armsAndLegs(g, 105, -43, 0, 0, 0, 0);
        armsAndLegs(g, 107, -45, 0, 0, 0, 0);
        // arms 1
        armsAndLegs(g, 85, 10, 2, asp, ah, 0);
        // arms 2
        armsAndLegs(g, 87, 0, 2, asp, ah, 0);
        // hand 1
        armsAndLegs(g, 60, 18, 1, asp, ah, 0);
        // hand 2
        armsAndLegs(g, 60, 8, 1, asp, ah, 0);
        // fingers 1
        armsAndLegs(g, 53, 18, 0, 0, 0, 0);
        armsAndLegs(g, 55, 21, 0, 0, 0, 0);
        armsAndLegs(g, 55, 15, 0, 0, 0, 0);
        // fingers 2
        armsAndLegs(g, 53, 8, 0, 0, 0, 0);
        armsAndLegs(g, 55, 11, 0, 0, 0, 0);
        armsAndLegs(g, 55, 5, 0, 0, 0, 0);
    }
}