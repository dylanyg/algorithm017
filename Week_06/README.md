学习笔记
动态规划
概念：动态递推
模板代码
** 递归终止条件 **
** 准备数据 **
** 解决子问题 **
** 合并处理最终结果 **
** 清理当前层状态 **

```java
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}
```
