<#import "spring.ftl" as spring/>
<html>
<head>
<#--    <title> <@spring.message "website.title"/></title>-->
</head>
    <body>
    <table>
        <#list userList as user>
           <tr>
               <td>
                   <a href="<@spring.url 'admin/userListftl/${user.userName}'/>">${user.userName}</a>
               </td>
               <td>
                   ${user.passWord}
               </td>
           </tr>
        </#list>
    </table>
    </body>
</html>
