
var projectName = "实验室管理系统"
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'inside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '实验室',
	url: './pages/shiyanshi/list.html'
}, 
{
	name: '设备',
	url: './pages/shebei/list.html'
}, 
{
	name: '消耗品',
	url: './pages/xiaohaopin/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootdtjr3/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"实验室","menuJump":"列表","tableName":"shiyanshi"}],"menu":"实验室管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"实验室申请","menuJump":"列表","tableName":"shiyanshishenqing"}],"menu":"实验室申请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备","menuJump":"列表","tableName":"shebei"}],"menu":"设备管理"},{"child":[{"buttons":["查看","修改","审核"],"menu":"设备报备","menuJump":"列表","tableName":"shebeibaobei"}],"menu":"设备报备管理"},{"child":[{"buttons":["查看","修改","审核"],"menu":"设备申请","menuJump":"列表","tableName":"shebeishenqing"}],"menu":"设备申请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"消耗品","menuJump":"列表","tableName":"xiaohaopin"}],"menu":"消耗品管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"消耗品领取","menuJump":"列表","tableName":"xiaohaopinlingqu"}],"menu":"消耗品领取管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"kefuguanli"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"实验室列表","menuJump":"列表","tableName":"shiyanshi"}],"menu":"实验室模块"},{"child":[{"buttons":["查看","报备","申请"],"menu":"设备列表","menuJump":"列表","tableName":"shebei"}],"menu":"设备模块"},{"child":[{"buttons":["查看","领取"],"menu":"消耗品列表","menuJump":"列表","tableName":"xiaohaopin"}],"menu":"消耗品模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"实验室申请","menuJump":"列表","tableName":"shiyanshishenqing"}],"menu":"实验室申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"设备报备","menuJump":"列表","tableName":"shebeibaobei"}],"menu":"设备报备管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"设备申请","menuJump":"列表","tableName":"shebeishenqing"}],"menu":"设备申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"消耗品领取","menuJump":"列表","tableName":"xiaohaopinlingqu"}],"menu":"消耗品领取管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"实验室列表","menuJump":"列表","tableName":"shiyanshi"}],"menu":"实验室模块"},{"child":[{"buttons":["查看","报备","申请"],"menu":"设备列表","menuJump":"列表","tableName":"shebei"}],"menu":"设备模块"},{"child":[{"buttons":["查看","领取"],"menu":"消耗品列表","menuJump":"列表","tableName":"xiaohaopin"}],"menu":"消耗品模块"}],"roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
