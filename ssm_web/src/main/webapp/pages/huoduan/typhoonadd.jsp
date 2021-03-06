<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 上午 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <!-- Bootstrap Styles-->

    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/huoduan/plugins/datepicker3.css">
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">
    <%--头部--%>
    <jsp:include page="toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="daohanglan.jsp"></jsp:include>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        <small></small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row" style="width: 600px;">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            增加一些设备
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form action="${pageContext.request.contextPath}/fantai/add.do" method="post">
                                        <div  >
                                            <label> 物资名称</label>
                                            <input class="form-control" placeholder=" 物资名称" value="桌子" name="mattername" >
                                        </div>
                                        <div  >
                                            <label>物资数量</label>
                                            <input class="form-control" placeholder="物资数量" value="10" name="matternum" >
                                        </div>
                                        <div  >
                                            <label>物资价格</label>
                                            <input class="form-control" placeholder="物资价格" value="10.00" name="matterprice" >
                                        </div>
                                        <div class="form-group">

                                            <label>物资类别ID</label>
                                            <select class="form-control" placeholder="" name="mattersortid">

                                                <c:forEach items="${tbMatter_sortList}" var="mht">
                                                    <option  value="${mht.mattersortid}">${mht.mattersort}</option>
                                                </c:forEach>

                                            </select>
                                        </div>

                                        <div>
                                            <label>入库时间</label>
                                            <input class="form-control" placeholder="年月日" id="dateid" value="2019-10-10" name="instoragetime">
                                        </div>
                                        <div>
                                            <label>出库时间</label>
                                            <input class="form-control" placeholder="年月日" id="date" value="2019-10-10" name="outstoragetime">
                                        </div>
                                        <div  >
                                            <label>物资状态</label>
                                            <input class="form-control" placeholder="联系方式" value="可用" name="matterstate" >
                                        </div>
                                        <br>
                                        <div>

                                            <button type="submit" class="btn btn-success"><i class=""></i> 确认增加 </button>

                                            <button type="button" class="btn btn-primary" onclick="history.back(-1);"><i class="fa fa-reply "></i>返回</button>

                                        </div>



                                    </form>
                                </div>

                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery.metisMenu.js"></script>
    <!-- Custom Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/custom-scripts.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>

    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/datatables/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/datatables/dataTables.bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/plugins/jquery-2.2.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/plugins/bootstrap-datepicker.js"></script>
    <script>
        $(document).ready(function() {
            $('#dateid').datepicker({
                format : "yyyy-mm-dd",
                autoclose: true,
                language: 'zh-CN'
            });
        });
    </script>
    <script>
        $(document).ready(function() {
            $('#date').datepicker({
                format : "yyyy-mm-dd",
                autoclose: true,
                language: 'zh-CN'
            });
        });
    </script>



</body>
</html>

