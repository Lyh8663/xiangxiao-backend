package team.xiangxiao.xiangxiao.pojo;

//用户收藏
public class Collection {
    private int uid;
    private int mid;

    @Override
    public String toString() {
        return "Collection{" +
                "uid=" + uid +
                ", mid=" + mid +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
