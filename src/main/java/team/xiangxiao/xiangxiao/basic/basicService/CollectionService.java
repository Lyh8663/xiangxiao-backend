package team.xiangxiao.xiangxiao.basic.basicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xiangxiao.xiangxiao.basic.basicMapper.CollectionMapper;
import team.xiangxiao.xiangxiao.pojo.Collection;

import java.util.List;

@Service
public class CollectionService {
    @Autowired
    private CollectionMapper collectionMapper;

    public List<Collection> selectByUId(int uid){
        return collectionMapper.selectByUId(uid);
    }

    public List<Collection> selectByMId(int mid){
        return collectionMapper.selectByMId(mid);
    }

    public int insertOne(Collection collection){
        return collectionMapper.insertOne(collection.getUid(),collection.getMid());
    }

    public int deleteOne(int uid){
        return collectionMapper.deleteOne(uid);
    }

    public Collection selectByUIdAndMid(int uid,int mid){
        return collectionMapper.selectByUIdAndMid(uid,mid);
    }

    public int deleteOneByUidAndMid(int uid, int mid){
        return collectionMapper.deleteOneByUidAndMid(uid, mid);
    }
}
