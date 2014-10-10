package com.football.reminder.ivomapper;

import java.util.List;
import com.football.reminder.vo.TeamSupport;

public interface TeamSupportMapper {
    int deleteByPrimaryKey(Long id);

List<TeamSupport> selectSearch(TeamSupport record);

List<TeamSupport> selectAll();

    int insert(TeamSupport record);

    int insertSelective(TeamSupport record);

    TeamSupport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TeamSupport record);

    int updateByPrimaryKey(TeamSupport record);
}
