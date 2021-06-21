package compositepattern;

/**
 * 
 * ���ģʽ�Ŀͻ��˲���
 * ģʽɱ�����̣����ģʽʹ�ö��ļ����ļ��е�ɾ����ʽһ�£��ӿͻ��˽Ƕ�������û������
 */
 
public class Client {
    public static void main(String[] args) {
        //*************************************************************************************
        //AbstractFile��û��add������ֻ��killVirus��������˰����·����������壬��Ҫ��ʹ��add����ʱ����ǿת
        //AbstractFile file01 = new Folder("�ҵ��ղ�");
        //((Folder) file01).add(file02);
        //*************************************************************************************
 
        Folder file01 = new Folder("�ҵ��ղ�");
        Folder file02 = new Folder("Java�ļ���");
        Folder file03 = new Folder("C++�ļ���");
        file01.add(file02);
        file01.add(file03);
        //file01.killVirus();
 
        AbstractFile file04 = new VideoFile("Java��Ƶ");
        AbstractFile file05 = new VideoFile("C++��Ƶ");
        file02.add(file04);
        file03.add(file05);
        //file04.killVirus();
 
        AbstractFile file06 = new ImageFile("Java�������ջ���");
        AbstractFile file07 = new ImageFile("C++ָ��ԭ��");
        file02.add(file06);
        file03.add(file07);
 
        AbstractFile file08 = new TextFile("Core Java Volume I: Fundamentals.pdf");
        AbstractFile file09 = new TextFile("C++ Primer.pdf");
        file02.add(file08);
        file03.add(file09);
 
        file01.killVirus();
    }
}
