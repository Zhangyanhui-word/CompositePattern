package compositepattern;

/**
 * 
 * 组合模式的客户端测试
 * 模式杀毒过程，组合模式使得对文件和文件夹的删除方式一致（从客户端角度来看，没有区别）
 */
 
public class Client {
    public static void main(String[] args) {
        //*************************************************************************************
        //AbstractFile中没有add方法，只有killVirus方法，因此按如下方法声明定义，需要在使用add方法时进行强转
        //AbstractFile file01 = new Folder("我的收藏");
        //((Folder) file01).add(file02);
        //*************************************************************************************
 
        Folder file01 = new Folder("我的收藏");
        Folder file02 = new Folder("Java文件夹");
        Folder file03 = new Folder("C++文件夹");
        file01.add(file02);
        file01.add(file03);
        //file01.killVirus();
 
        AbstractFile file04 = new VideoFile("Java视频");
        AbstractFile file05 = new VideoFile("C++视频");
        file02.add(file04);
        file03.add(file05);
        //file04.killVirus();
 
        AbstractFile file06 = new ImageFile("Java垃圾回收机制");
        AbstractFile file07 = new ImageFile("C++指针原理");
        file02.add(file06);
        file03.add(file07);
 
        AbstractFile file08 = new TextFile("Core Java Volume I: Fundamentals.pdf");
        AbstractFile file09 = new TextFile("C++ Primer.pdf");
        file02.add(file08);
        file03.add(file09);
 
        file01.killVirus();
    }
}
