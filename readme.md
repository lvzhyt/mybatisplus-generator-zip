mybatis plus 代码生成工具

模板工具 velocity

修改配置文件 generator.properties

```properties
package=com.paw
#模块名，生成的类的package为：com.paw.generator
moduleName=generator
#表前缀，如表tb_sys_user 生成类 sys_user
tablePrefix=tb_
```

启动项目访问
```html
分页获取表名
http://localhost:8080/generator/list?page=1&limit=10

生成代码 多表用,分隔
http://localhost:8080/generator/code?tables=table_name

```

velocity 模板 resources/templates/

### 通过测试类生成 
SysGeneratorServiceImplTest 