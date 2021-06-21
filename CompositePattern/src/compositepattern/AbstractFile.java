package compositepattern;

import java.util.ArrayList;
import java.util.List;
 
/**
 * ʹ�����ģʽģ��ɱ������ܹ����
 * 
 */
 
public interface AbstractFile {
    void killVirus();  //ɱ��
}
 
//Ҷ�ӹ���1-ͼƬ�ļ�
class ImageFile implements AbstractFile {
    private String name;
    public ImageFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("ͼƬ�ļ�ɱ����" + name + "��ɱ��...");
    }
}
 
//Ҷ�ӹ���2-�ı��ļ�
class TextFile implements AbstractFile {
    private String name;
    public TextFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("�ı��ļ�ɱ����" + name + "��ɱ��...");
    }
}
 
//Ҷ�ӹ���3-��Ƶ�ļ�
class VideoFile implements AbstractFile {
    private String name;
    public VideoFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("��Ƶ�ļ�ɱ����" + name + "��ɱ��...");
    }
}
 
//��������-�ļ���
class Folder implements AbstractFile {
    private String name;
    //�����µ��ӽڵ㣬������һ������������Ҳ������һ��Ҷ�ӹ���
    private List<AbstractFile> list = new ArrayList<>();
 
    public Folder(String name) {
        this.name = name;
    }
 
    @Override
    public void killVirus() {
        System.out.println("�ļ���ɱ����" + name + "��ɱ��...");
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

