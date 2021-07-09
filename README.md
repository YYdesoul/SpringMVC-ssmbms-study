# 排错思路

## 1. Bean不存在
步骤：
1. 查看这个bean注入是否成功
2. JUnit单元测试，看我们的代码是否能够查询出来结果
3. SpringMVC的问题
    - SpringMVC整合的时候没有调用到我们的Service层(在web.xml中应该调用applicationContext.xml)