<%@ include file="../../appcomm/basePath.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
        <title>天能物业管理</title>
        <link rel="stylesheet" href="pages/gitqian/css/index.css" type="text/css">
        <link rel="stylesheet" href="pages/gitqian/css/zym.css" type="text/css">

        <script type="text/javascript" src="pages/gitqian/js/jquery.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/global.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/hm.js"></script>
        <script type="text/javascript" src="pages/gitqian/js/script.js"></script>



    </head>
<body>
<!--头部-->
<div class="top_bg" id="top_bg">
    <div class="top_gang">
        <div class="tou_zj">
            <div class="hy">
                <img src="pages/gitqian/images/tou_tb_03.png">
                <span>欢迎来到贵州天能物业管理有限公司</span>
            </div>
            <div class="soucang">
                <a href="#">设为首页&nbsp;</a>｜
                <a href="#">&nbsp;加入收藏</a>
            </div>
        </div>
    </div>
    <div class="top_main">
        <div class="top_logo">
            <a href='./'><img src="pages/gitqian/images/logo.png"></a>
        </div>
        <!--导航-->
        <div class="daohang">
            <div class="header_nav">
                <div class="main clearBoth">
                    <ul class="nav right">
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="index.html">
                                网站首页
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="about.html">
                                关于我们
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="about.html">公司简介</a>
                                    </li>
                                    <li>
                                        <a href="#">公司文化</a>
                                    </li>
                                    <li>
                                        <a href="#">领导致辞</a>
                                    </li>
                                    <li>
                                        <a href="#">服务理念</a>
                                    </li>
                                    <li>
                                        <a href="#">企业荣誉</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="products.html">
                                项目展示
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="#">经典案例</a>
                                    </li>
                                    <li>
                                        <a href="#">公司项目</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="nt/searchnes.do?ntid=1">
                                公司动态
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <c:forEach var="news" items="${newstypeList}">
                                        <li>
                                            <a href="nt/searchnes.do?ntid=${news.ntid}">${news.ntypename}</a>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="javascript:;">
                                人才招聘
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="contact.html">
                                联系我们
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="contact.html">在线留言</a>
                                    </li>
                                    <li>
                                        <a href="#">联系我们</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--子页-->
<div class="ziye_bj">
    <div class="ziye_tu">
        <img src="pages/gitqian/images/zy1_02.jpg">
    </div>
</div>
<!--关于我们-->
<div class="zy_gywm">
    <div class="ejdh" style="height: 1050px;">
        <div class="shang_g"></div>
        <div class="women">
            <div class="btmc">
                <h1>N</h1>
                <p>公司动态<span>ews</span></p>
            </div>
            <ul class="skb">
                <li style="background: #005bac; width: 25%;"></li>
                <li style="background: #ff8400; width: 20%;"></li>
                <li style="background: #d3d3d3; width: 55%;"></li>
            </ul>
        </div>
        <div class="zy_dh_lb">
            <ul>
                <c:forEach var="newstype" items="${newstypeList}">
                    <li id="women"><img src="pages/gitqian/images/zy1_08_z.png"><a id="wenzidangq" href="nt/searchnes.do?ntid=${newstype.ntid}">${newstype.ntypename}</a></li>
                </c:forEach>
            </ul>

        </div>
    </div>
    <div class="touyin"></div>
    <div class="zynr_db" style="height: 1000px;">
        <div class="lujing">

            <h2>公司新闻</h2>
            <p>您的位置：首页 > 公司新闻</p>
        </div>
        <ul class="skb" style="margin-bottom: 20px;">
            <li style="background: #005bac; width: 12%;"></li>
            <li style="background: #ff8400; width: 15%;"></li>
            <li style="background: #d3d3d3; width: 73%;"></li>
        </ul>

        <!--内容-->
        <div class="gsjj_nr">
            <ul class="xwlb_bj">

                <c:forEach var="news"  items="${news1}">
                <li>

                    <h1><a href="news/one.do?ncid=${news.ncid}"><img src="pages/gitqian/images/zy1_12.jpg"></a></h1>
                    <dl>

                        <dt><a href="news/one.do?ncid=${news.ncid}">${news.nctitle}</a></dt>


                        <dd>${fn:length(news.nccontent) > 100 ? fn:substring(news.nccontent,0,100) : news.nccontent}${fn:length(news.nccontent) > 100 ? '...' : ''}</dd>

                        <c:forEach items="${newst}"  var="newst">
                        <span>来源：${newst.ntypename}</span>
                        </c:forEach>


                        <span>日期：<fmt:formatDate value="${news.nctime}" pattern="yyyy年MM月dd日" /> </span>

                    </dl>
                </li>
                </c:forEach>
            </ul>
            <div class="webdiyerCss">
                <%--<a href="" disabled="disabled" style="margin-right:5px;"></a>--%>
                <%--<a disabled="disabled" style="margin-right:5px;">上一页</a>--%>
                <%--<span class="redcss page_go" style="margin-right:5px;">1</span>--%>
                <%--<a href="pagenum=1" style="margin-right:5px;">2</a>--%>
                <%--<a href="#" style="margin-right:5px;">首页</a>--%>
                <%--<a href="#" style="margin-right:5px;">下一页</a>--%>
                <%--<a href="#" style="margin-right:5px;">下一页</a>--%>
                <%--<a href="#" style="margin-right:5px;">尾页</a>--%>
            </div>
        </div>
    </div>
</div>


<!--底部-->
<div class="dibu">
    <div class="dibu_jz">
        <div class="dibu_zuo">
            <p>联系地址：贵州省贵阳市市南路120号黔电发展楼6楼<br>
                电 话：0851-85594612   传 真：0851-85594612<br></p>
            <ul>
                <li><span>分享到：</span></li>
                <li><a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu" target="_black"><img src="pages/gitqian/images/dibu_06.png"></a></li>
                <li><a href="http://service.weibo.com/share/share.php" target="_black"><img src="pages/gitqian/images/dibu_08.png"></a></li>
                <li><a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description=" target="_black"><img src="pages/gitqian/images/dibu_10.png"></a></li>
            </ul>
        </div>
        <div class="dibu_you">
            <ul>
                <li><a href="#">公司简介&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">企业文化&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">人才招聘&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">意见反馈&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">联系我们</a></li>
            </ul>
            <img class="dibu_logo" src="pages/gitqian/images/dibu_03.png">
        </div>
    </div>
</div>
<div class="dibu_1">
    <p>版权所有 贵州天能物业管理有限公司 黔ICP备10001741号<br>
        技术支持：WangID 驰通网络</p>
</div>


</body>
</html>