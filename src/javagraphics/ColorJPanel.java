package javagraphics;
import java.awt.*;
import java.awt.geom.QuadCurve2D;
import javax.swing.JPanel;
/**
 *
 * @author Rayhan Anandhias
 */
public class ColorJPanel extends JPanel {
    @Override
    public void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        Graphics2D g2d = (Graphics2D)graph;
        
        Color backColor = new Color(120,120,120);
        this.setBackground(backColor);
        
        graph.setColor(new Color(94,94,94));
        Polygon p = new Polygon();
        p.addPoint(1340, 1078);
        p.addPoint(1117, 875);
        graph.fillPolygon(p);
        
        Polygon p1 = new Polygon();
        p1.addPoint(1340, 1078);
        p1.addPoint(1340, 254);
        p1.addPoint(1106, 57);
        p1.addPoint(1121, 513);
        p1.addPoint(1216, 777);
        graph.fillPolygon(p1);
        
        Polygon p2 = new Polygon();
        p2.addPoint(1340, 1078);
        p2.addPoint(1216, 777);
        p2.addPoint(1040, 1079);
        graph.fillPolygon(p2);
        
        Polygon p3 = new Polygon();
        p3.addPoint(1061, 1079);
        p3.addPoint(959, 970);
        p3.addPoint(1216, 811);
        graph.fillPolygon(p3);
        
        Polygon p4 = new Polygon();
        p4.addPoint(1040, 1079);
        p4.addPoint(959, 970);
        p4.addPoint(1117, 875);
        graph.fillPolygon(p4);
        
        Polygon p5 = new Polygon();
        p5.addPoint(959, 970);
        p5.addPoint(1117, 875);
        p5.addPoint(1035, 827);
        graph.fillPolygon(p5);
        
        Polygon p6 = new Polygon();
        p6.addPoint(1117, 875);
        p6.addPoint(1216, 777);
        p6.addPoint(1200, 700);
        graph.fillPolygon(p6);
        graph.fillRect(1070, 770, 246, 800);
        
        Polygon p7 = new Polygon();
        p7.addPoint(1040, 1079);
        p7.addPoint(802, 877);
        p7.addPoint(1110, 700);
        graph.fillPolygon(p7);
        
        Polygon p9 = new Polygon();
        p9.addPoint(604, 619);
        p9.addPoint(744, 750);
        p9.addPoint(870, 619);
        graph.fillPolygon(p9);
        graph.fillRect(840, 619, 500, 290);
        graph.fillRect(745, 619, 150, 130);
        
        Polygon p10 = new Polygon();
        p10.addPoint(816, 55);
        p10.addPoint(852, 158);
        p10.addPoint(890, 138);
        graph.fillPolygon(p10);
        
        //LOGO BATMAN
        graph.setColor(new Color(39,39,39));
        QuadCurve2D q = new QuadCurve2D.Float();
        
        q.setCurve(959, 970, 904, 811, 802, 877);
        g2d.draw(q);
        
        q.setCurve(959, 970, 1024, 813, 1117, 875);
        g2d.draw(q);
        
        q.setCurve(1117, 875, 1114, 767, 1216, 777);
        g2d.draw(q);
        
        q.setCurve(802, 877, 811, 775, 703, 778);
        g2d.draw(q);
        
        q.setCurve(703, 778, 825, 687, 893, 682);
        g2d.draw(q);
        g2d.fill(q);
        
        q.setCurve(893, 682, 870, 760, 932, 752);
        g2d.draw(q);
        
        graph.drawLine(932, 752, 933, 694);
        q.setCurve(933, 694, 958, 726, 982,694);
        g2d.draw(q);
        
        graph.drawLine(982,694, 984, 752);
        q.setCurve(984, 752, 1050, 760, 1026, 682);
        g2d.draw(q);
        
        q.setCurve(1216, 777, 1127, 708, 1026, 682);
        g2d.draw(q);
        g2d.fill(q);
        
        Polygon p11 = new Polygon();
        p11.addPoint(802, 877);
        p11.addPoint(703, 778);
        p11.addPoint(893, 682);
        graph.fillPolygon(p11);
        q.setCurve(802, 877, 811, 775, 703, 778);
        graph.setColor(new Color(120,120,120));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        q.setCurve(803, 864, 811, 775, 703, 778);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p12 = new Polygon();
        p12.addPoint(893, 682);
        p12.addPoint(932, 752);
        p12.addPoint(802, 877);
        graph.fillPolygon(p12);
        
        q.setCurve(893, 682, 870, 760, 932, 752);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p13 = new Polygon();
        p13.addPoint(802, 877);
        p13.addPoint(932, 752);
        p13.addPoint(959, 970);
        graph.fillPolygon(p13);
        q.setCurve(959, 970, 904, 811, 802, 877);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p14 = new Polygon();
        p14.addPoint(932, 752);
        p14.addPoint(959, 970);
        p14.addPoint(984, 752);
        graph.fillPolygon(p14);
        
        Polygon p15 = new Polygon();
        p15.addPoint(932, 752);
        p15.addPoint(933, 694);
        p15.addPoint(982,694);
        p15.addPoint(984, 752);
        graph.fillPolygon(p15);
        q.setCurve(933, 694, 958, 726, 982,694);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p16 = new Polygon();
        p16.addPoint(984, 752);
        p16.addPoint(959, 970);
        p16.addPoint(1117, 875);
        graph.fillPolygon(p16);
        q.setCurve(959, 970, 1024, 813, 1117, 875);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p17 = new Polygon();
        p17.addPoint(984, 752);
        p17.addPoint(1026, 682);
        p17.addPoint(1117, 875);
        graph.fillPolygon(p17);
        q.setCurve(984, 752, 1050, 760, 1026, 682);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        graph.setColor(new Color(94,94,94));
        g2d.drawLine(984, 752, 1026, 682);
        graph.setColor(new Color(39,39,39));
        
        Polygon p18 = new Polygon();
        p18.addPoint(1216, 777);
        p18.addPoint(1026, 682);
        p18.addPoint(1117, 875);
        graph.fillPolygon(p18);
        q.setCurve(1117, 875, 1114, 767, 1216, 777);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        
        
        //MUKA BATMAN
        graph.drawLine(604, 619, 1316, 619);
        q.setCurve(604, 619, 617, 596, 650, 594);
        g2d.draw(q);
        g2d.fill(q);
        q.setCurve(650, 594, 813, 546, 800, 513);
        g2d.draw(q);
        q.setCurve(801, 513, 799, 83, 816, 55);
        g2d.draw(q);
        g2d.fill(q);
        q.setCurve(816, 55, 820, 110, 852, 158);
        g2d.draw(q);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        q.setCurve(852, 158, 956, 94, 1068, 155);
        g2d.draw(q);
        g2d.fill(q);
        q.setCurve(1068, 155, 1103, 106, 1106, 57);
        g2d.draw(q);
        q.setCurve(1106, 57, 1119, 90, 1121, 513);
        g2d.draw(q);
        g2d.fill(q);
        q.setCurve(1121, 513, 1122, 556, 1283, 594);
        g2d.draw(q);
        q.setCurve(1283, 594, 1305, 593, 1316, 619);
        g2d.draw(q);
        g2d.fill(q);
        
        Polygon p19 = new Polygon();
        p19.addPoint(604, 619);
        p19.addPoint(650, 594);
        p19.addPoint(1283, 594);
        p19.addPoint(1316, 619);
        graph.fillPolygon(p19);
        
        Polygon p20 = new Polygon();
        p20.addPoint(650, 594);
        p20.addPoint(800, 513);
        p20.addPoint(1121, 513);
        p20.addPoint(1316, 619);
        graph.fillPolygon(p20);
        q.setCurve(650, 594, 813, 546, 800, 513);
        graph.setColor(new Color(120,120,120));
        g2d.fill(q);
        graph.drawLine(650, 594, 800, 513);
        graph.setColor(new Color(39,39,39));
        q.setCurve(1121, 513, 1122, 556, 1283, 594);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p21 = new Polygon();
        p21.addPoint(801, 513);
        p21.addPoint(809, 158);
        p21.addPoint(1113, 155);
        p21.addPoint(1121, 513);
        graph.fillPolygon(p21);
        
        Polygon p22 = new Polygon();
        p22.addPoint(809, 158);
        p22.addPoint(816, 55);
        p22.addPoint(852, 158);
        graph.fillPolygon(p22);
        q.setCurve(816, 55, 820, 110, 852, 158);
        graph.setColor(new Color(94,94,94));
        g2d.fill(q);
        graph.setColor(new Color(39,39,39));
        
        Polygon p23 = new Polygon();
        p23.addPoint(1068, 155);
        p23.addPoint(1106, 57);
        p23.addPoint(1113, 155);
        graph.fillPolygon(p23);
        q.setCurve(1068, 155, 1103, 106, 1106, 57);
        graph.setColor(new Color(120,120,120));
        g2d.fill(q);
        graph.drawLine(1068, 155, 1106, 57);
        graph.setColor(new Color(39,39,39));
        graph.drawLine(1068, 155, 1113, 155);
        
        Polygon p27 = new Polygon();
        p27.addPoint(1283, 594);
        p27.addPoint(1253, 589);
        p27.addPoint(1257, 597);
        graph.fillPolygon(p27);
        
        
        //MATA
        graph.setColor(new Color(255,255,255));
        Polygon p24 = new Polygon();
        p24.addPoint(859,394);
        p24.addPoint(854,371);
        p24.addPoint(919,408);
        graph.fillPolygon(p24);
        
        Polygon p25 = new Polygon();
        p25.addPoint(1059,394);
        p25.addPoint(1065,371);
        p25.addPoint(999,408);
        graph.fillPolygon(p25);
        
        //MULUT
        graph.setColor(new Color(233,202,199));
        Polygon p26 = new Polygon();
        p26.addPoint(851,435);
        p26.addPoint(960,498);
        p26.addPoint(1065,435);
        p26.addPoint(1047,565);
        p26.addPoint(1002,590);
        p26.addPoint(914,590);
        p26.addPoint(872,565);
        graph.fillPolygon(p26);
    }
}