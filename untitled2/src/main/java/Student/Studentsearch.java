package Student;

import req.SearchRequest;
import req.TipsRequst;
import res.*;

/**
 * 学生查询接口
 */
public interface Studentsearch {
    //查询自己的成绩
    StuDTO Mysearch(SearchRequest searchRequest);
    //查看自己的排名
    int Mylocation(String a);
    //发送建议
    Boolean assess(Stutips stutips);
    //查看建议
    TipsDTO seeTip(TipsRequst tipsRequst);
    //修改密码
    boolean updatenewpsw(TeaGetDTO teaGetDTO);
    //检查原来输入的密码是否正确
    boolean checkpsw(TeaGetDTO teaGetDTO);

}
