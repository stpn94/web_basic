package web_basic.jsp_13.erp;

import java.util.List;

/*
 * Data Access Object
 * C(insert)
 * R(select, select where)
 * U(update)
 * D(delete)
 */


public interface TitleDao {
	List<Title> selectTitleByAll();
	Title selectTitleByNo(Title title);
	
	int insertTitle(Title title); //객체
	int updateTitle(Title title); 
	int deleteTitle(int titleNo); //기본타입
	
}
