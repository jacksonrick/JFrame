# JFrame
##### JFrame - SSM Frame Project <br>
`jackson-rick`    `v3.7` <br>
`IntelliJ IDEA`

### 模块
* jframe `文档/配置/共享静态资源`
* jframe-core `服务类/系统相关`
* jframe-model `实体类/Mapper`
* jframe-utils `工具类`
* jframe-web-app `App端`
* jframe-web-front `PC前端`
* jframe-web-manage `后台管理系统`

### 集成
* Spring/SpringMVC/MyBatis
* Spring Redis/Redis Session
* 拦截器/AppToken/FastDFS
* 后台管理：自定义权限、模块、地址、文件等
* 线程池、日志服务、异常管理
* PageHelper分页、封装分页组件
* Freemarker模板、封装函数和指令
* Quartz(单点/集群)、管理器
* 第三方：微信/支付宝/推送/高德/阿里云/短信/邮件
* 未集成：Spring-WebSocket
* Util包：
    * 字符、时间、数字转换/JSON/Http/PDF+Excel/分页/文件/对象/验证器...
    * 其他：`jframe-utils/`
* JS插件：
    * 封装：Ajax/DataTables/CityPicker/Layer/DatePicker...
    * 其他：`jframe/public/static/library/plugins/`
    * Demo：`jframe-web-front/../WEB-INF/demo/`

### 更新日志：
* v3.7 `20171022`
    * 1.更新页面模板：Freemarker
* v3.6.1 `20171016`
    * 1.新的分页插件：pageHelper
    * 2.优化dataTables
* v3.6 `20171012`
    * 1.新增Spring Data Session
    * 2.升级Spring至4.3.11
    * 3.优化日志服务
* v3.5.5 `20170930`
    * 1.新增Quartz管理器
    * 2.优化日志服务
    * 3.新增地址插件
    * 4.优化部分JS插件
* v3.5.4 `20170921`
    * 1.新增后台模块管理
    * 2.新增阿里云服务
    * 3.优化日志服务
* v3.5.3 `20170825`
    * 1.优化后台页面和部分JS插件
    * 2.优化支付接口和推送接口
* v3.5.2 `20170801`
    * 1.优化Redis服务
    * 2.优化AppToken服务
* v3.5.1 `20170620`
    * 1.优化SQL查询和实体类查询
    * 2.新增第三方验证码接口
    * 3.新增多个Util工具类
    * 4.新增和优化PC/APP上传插件和服务端
    * 5.新增Redis服务和AppToken
* v3.4.3 `20170525`
    * 1.更新部分SQL稳定性
    * 2.新增第三方支付和推送接口
* v3.4.2 `20170424`
    * 1.新增FastDFS文件存储
    * 2.模块分层，优化结构
    * 3.统一的异常处理
* v3.4.1 `20170324`
    * 1.新增地址和图片上传组件
    * 2.优化封装的JS插件
* v1.x `20160601`
    * JFrame项目Start
    