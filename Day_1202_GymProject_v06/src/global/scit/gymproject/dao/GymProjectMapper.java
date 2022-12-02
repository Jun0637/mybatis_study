package global.scit.gymproject.dao;

import java.util.List;

import global.scit.gymproject.vo.GymVO;

public interface GymProjectMapper {
	public int insertMember(GymVO vo);
	public int updateMember(GymVO vo);
	public int deleteMember(String usrid);
	public List<GymVO> selectAll();
	public GymVO selectOne(String usrid);
}
