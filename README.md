# springboot-mybatis-miniprogram
测试异常类的时候，我用的是AreaServiceImpl里的getAreaById
在方法里添加int a = 1/0
http://localhost:8085/mini/superadmin/getareabyid?areaId=1
若出现
{
success: false,
errMsg: null
}
应为
{
success: false,
errMsg: / by zero
}
原因为?areaId=1被浏览器解析为?areaid=1
