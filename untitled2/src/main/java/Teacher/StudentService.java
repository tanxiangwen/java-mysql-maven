package Teacher;

import req.StudentRequest;
import res.StudentDO;
import res.StugetDTO;
import res.TableDTO;

/**
 * 教师端查询接口
 */
public interface StudentService {
    TableDTO retrieveStudent(StudentRequest requst);//查询包含:当前第几页，// 每页查多少，查询词

    boolean add(StudentDO studentDO);

    StudentDO getByid(String selectedstudentsno);

    boolean update(StudentDO studentDO);


    boolean delete(String selectedstudentsno);

    /**
     * 这两个是学生的方法写错了地方
     * @param stugetDTO
     * @return
     */
    //修改密码
    boolean updatenewpsw(StugetDTO stugetDTO);
    //检查原来输入的密码是否正确
    boolean checkpsw(StugetDTO stugetDTO);
}
