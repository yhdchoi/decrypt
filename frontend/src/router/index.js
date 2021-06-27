import { createRouter, createWebHashHistory } from "vue-router";
import Home from "../views/Home.vue";
import About from "../views/About.vue";
import GetBoard from "../views/board/GetBoard.vue";
import PostBoard from "../views/board/PostBoard.vue";
import Contact from "../views/Contact.vue";
import Profile from "../views/user/Profile.vue";
import Dashboard from "../views/user/Dashboard.vue";
import Inbox from "../views/user/Inbox.vue";
import Friends from "../views/user/Friends.vue";
import Settings from "../views/user/Settings.vue";


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
    path: "/user/friends",
    name: "Friends",
    component: Friends,
  },
  {
    path: "/user/settings",
    name: "Settings",
    component: Settings,
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
