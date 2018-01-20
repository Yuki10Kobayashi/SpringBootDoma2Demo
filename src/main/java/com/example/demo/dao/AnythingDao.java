package com.example.demo.dao;

    import com.example.demo.entity.AnythingEntity;
    import org.seasar.doma.Dao;
    import org.seasar.doma.Insert;
    import org.seasar.doma.Select;
    import org.seasar.doma.boot.ConfigAutowireable;

    import java.util.List;

@ConfigAutowireable
@Dao
public interface AnythingDao {

    @Select
    List<AnythingEntity> selectAll();

    @Insert
    int insert(AnythingEntity anything);
}
