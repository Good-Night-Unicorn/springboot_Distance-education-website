import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import kechengleibie from '@/views/modules/kechengleibie/list'
    import kechengzuoye from '@/views/modules/kechengzuoye/list'
    import jiaoxueshipin from '@/views/modules/jiaoxueshipin/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import discusskechengzuoye from '@/views/modules/discusskechengzuoye/list'
    import zuoyepigai from '@/views/modules/zuoyepigai/list'
    import examquestion from '@/views/modules/examquestion/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import zuoyetijiao from '@/views/modules/zuoyetijiao/list'
    import jiaoxueziliao from '@/views/modules/jiaoxueziliao/list'
    import exampaper from '@/views/modules/exampaper/list'
    import forum from '@/views/modules/forum/list'
    import discussjiaoxueshipin from '@/views/modules/discussjiaoxueshipin/list'
    import systemintro from '@/views/modules/systemintro/list'
    import exampaperlist from '@/views/modules/exampaperlist/list'
    import discussjiaoxueziliao from '@/views/modules/discussjiaoxueziliao/list'
    import examquestionbank from '@/views/modules/examquestionbank/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
      ,{
	path: '/kechengleibie',
        name: '课程类别',
        component: kechengleibie
      }
      ,{
	path: '/kechengzuoye',
        name: '课程作业',
        component: kechengzuoye
      }
      ,{
	path: '/jiaoxueshipin',
        name: '教学视频',
        component: jiaoxueshipin
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/discusskechengzuoye',
        name: '课程作业评论',
        component: discusskechengzuoye
      }
      ,{
	path: '/zuoyepigai',
        name: '作业批改',
        component: zuoyepigai
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/zuoyetijiao',
        name: '作业提交',
        component: zuoyetijiao
      }
      ,{
	path: '/jiaoxueziliao',
        name: '教学资料',
        component: jiaoxueziliao
      }
      ,{
	path: '/exampaper',
        name: '在线考试管理',
        component: exampaper
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/discussjiaoxueshipin',
        name: '教学视频评论',
        component: discussjiaoxueshipin
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/exampaperlist',
        name: '在线考试列表',
        component: exampaperlist
      }
      ,{
	path: '/discussjiaoxueziliao',
        name: '教学资料评论',
        component: discussjiaoxueziliao
      }
      ,{
	path: '/examquestionbank',
        name: '试题库管理',
        component: examquestionbank
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '测试记录',
        component: examrecord
      }
      ,{
	path: '/newstype',
        name: '系统公告分类',
        component: newstype
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
