package compositepattern;

import java.util.ArrayList;
import java.util.List;
 
/**
 * 使用组合模式模拟杀毒软件架构设计
 * 
 */
 
public interface AbstractFile {
    void killVirus();  //杀毒
}
 
//叶子构件1-图片文件
class ImageFile implements AbstractFile {
    private String name;
    public ImageFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("图片文件杀毒：" + name + "查杀中...");
    }
}
 
//叶子构件2-文本文件
class TextFile implements AbstractFile {
    private String name;
    public TextFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("文本文件杀毒：" + name + "查杀中...");
    }
}
 
//叶子构件3-视频文件
class VideoFile implements AbstractFile {
    private String name;
    public VideoFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("视频文件杀毒：" + name + "查杀中...");
    }
}
 
//容器构件-文件夹
class Folder implements AbstractFile {
    private String name;
    //容器下的子节点，可能是一个容器构件，也可能是一个叶子构件
    private List<AbstractFile> list = new ArrayList<>();
 
    public Folder(String name) {
        this.name = name;
    }
 
    @Override
    public void killVirus() {
        System.out.println("文件夹杀毒：" + name + "查杀中...");
        for(AbstractFile file : list ) {
            file.killVirus();
        }
    }
 
    public void add(AbstractFile file) {
        list.add(file);
    }
 
    public void remove(AbstractFile file) {
        list.remove(file);
    }
 
    public AbstractFile getChild(int index) {
        if(index < list.size()) return list.get(index);
        return null;
    }
}

