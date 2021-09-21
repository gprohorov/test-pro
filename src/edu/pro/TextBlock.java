package edu.pro;
/*
  @author   george
  @project   test-pro
  @class  TextBlock
  @version  1.0.0 
  @since 21.09.21 - 21.47
*/

public class TextBlock {
    private int id;
    private long beginsFrom;
    private int size;
    private String text;

    public TextBlock() {
    }

    public TextBlock(int id, long beginsFrom, int size, String text) {
        this.id = id;
        this.beginsFrom = beginsFrom;
        this.size = size;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBeginsFrom() {
        return beginsFrom;
    }

    public void setBeginsFrom(long beginsFrom) {
        this.beginsFrom = beginsFrom;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
