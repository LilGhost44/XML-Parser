public class File {
    private String name;
    private String filepath;
    private String content;

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", filepath='" + filepath + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public File(String name, String filepath, String content) {
        this.name = name;
        this.filepath = filepath;
        this.content = content;
    }
}
