package example.dao;

public enum DBSql {
    updateStudentGroupLeaderSQL("update student set study_leader=? where student_no=?"),
    updatePasswordSQL("update student set student_pw=? where student_no=?"),
    updateStudentGroupSQL("update student set group_no=? where student_no=?"),
    updateGroupTopicSQL("update group set study_topic=? where group_no=?"),
    updateBoardTitleSQL("update board set board_title=? where board_no=?"),
    updatePostSQL("update board set post_title=?, post_content=?, post_time = now() where board_no=?"),
    deleteStudentSQL("delete from student where student_no=?"),
    deletePostSQL("delete from student where post_no=?"),
    deleteGroupSQL("delete from student where group_no=?"),
    deleteBoardSQL("delete from student where board_no=?"),
    insertGroupSQL("insert into group values(?,?)"),
    insertBoardSQL("insert into board values(null,?)"),
    insertPostSQL("insert into post values(null,?,?,?,?,?)"),
    insertStudentSQL("insert into student values(null,?,?,?,?)");
	
	private final String text;
    
	DBSql(String text) {
        this.text = text;
    }
    public String text(){
        return text;
    }
}
