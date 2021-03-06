import { createRouter, createWebHashHistory } from "vue-router";
import Home from "../views/Home.vue";
import About from "../views/About.vue";
import GetBoard from "../views/board/GetBoard.vue";
import PostBoard from "../views/board/PostBoard.vue";
import Contact from "../views/Contact.vue";
import Profile from "../views/user/Profile.vue";
import Dashboard from "../views/user/Dashboard.vue";
import Inbox from "../views/user/Inbox.vue";
import Connections from "../views/user/Connections.vue";
import Settings from "../views/user/Settings.vue";
import Signin from "../views/security/Login.vue";
import Signup from "../views/security/Signup.vue";




const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/about",
    name: "About",
    component: About,
  },
  {
    path: "/board/list",
    name: "GetBoard",
    component: GetBoard,
  },
  {
    path: "/board/post",
    name: "PostBoard",
    component: PostBoard,
  },
  {
    path: "/contact",
    name: "Contact",
    component: Contact,
  },
  {
    path: "/user/profile",
    name: "Profile",
    component: Profile,
  },
  {
    path: "/user/dashboard",
    name: "Dashboard",
    component: Dashboard,
  },
  {
    path: "/user/inbox",
    name: "Inbox",
    component: Inbox,
  },
  {
    path: "/user/connections",
    name: "Connections",
    component: Connections,
  },
  {
    path: "/user/settings",
    name: "Settings",
    component: Settings,
  },
  {
    path: "/user/signin",
    name: "Signin",
    component: Signin,
  },
  {
    path: "/user/signup",
    name: "Signup",
    component: Signup,
  },


  // {
  //   path: "/about",
  //   name: "About",
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () =>
  //     import(/* webpackChunkName: "about" */ "../views/About.vue"),
  // },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
