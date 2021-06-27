/* eslint-disable */

<!-- This example requires Tailwind CSS v2.0+ -->
<template>
  <Disclosure as="nav" class="bg-gray-800" v-slot="{ open }">
    <div class="max-w-7xl mx-auto px-2 sm:px-6 lg:px-8">
      <div class="relative flex items-center justify-between h-16">
        <div class="absolute inset-y-0 left-0 flex items-center sm:hidden">
          <!-- Mobile menu button-->
          <DisclosureButton
            class="
              inline-flex
              items-center
              justify-center
              p-2
              rounded-md
              text-gray-400
              hover:text-white hover:bg-gray-700
              focus:outline-none focus:ring-2 focus:ring-inset focus:ring-white
            "
          >
            <span class="sr-only">Open main menu</span>
            <MenuIcon v-if="!open" class="block h-6 w-6" aria-hidden="true" />
            <XIcon v-else class="block h-6 w-6" aria-hidden="true" />
          </DisclosureButton>
        </div>

        <div
          class="
            flex-1 flex
            items-center
            justify-center
            sm:items-stretch sm:justify-start
          "
        >
          <div class="flex-shrink-0 flex items-center">
            <router-link
              :to="{ name: 'Home' }"
              class="
                hidden
                lg:block
                h-18
                w-auto
                text-gray-50 text-lg
                font-bold
                hover:text-purple-500
              "
              >DEcrypt</router-link
            >
          </div>
          <div class="hidden md:block md:ml-5">
            <div class="flex space-x-4">
              <router-link
                :to="{ name: 'About' }"
                class="
                  text-gray-300
                  hover:bg-gray-700 hover:text-white
                  px-3
                  py-2
                  rounded-md
                  text-sm
                  font-medium
                "
                >About</router-link
              >
              <router-link
                :to="{ name: 'GetBoard' }"
                class="
                  text-gray-300
                  hover:bg-gray-700 hover:text-yellow-500
                  px-3
                  py-2
                  rounded-md
                  text-sm
                  font-medium
                "
                >GET</router-link
              >
              <router-link
                :to="{ name: 'PostBoard' }"
                class="
                  text-gray-300
                  hover:bg-gray-700 hover:text-blue-500
                  px-3
                  py-2
                  rounded-md
                  text-sm
                  font-medium
                "
                >POST</router-link
              >
              <router-link
                :to="{ name: 'Contact' }"
                class="
                  text-gray-300
                  hover:bg-gray-700 hover:text-white
                  px-3
                  py-2
                  rounded-md
                  text-sm
                  font-medium
                "
                >Contact</router-link
              >
            </div>
          </div>
        </div>

        <div
          class="
            absolute
            inset-y-0
            right-0
            flex
            items-center
            pr-2
            sm:static sm:inset-auto sm:ml-6 sm:pr-0
          "
        >
          <!-- Search Bar -->
          <!-- <div class="hidden md:block md:mr-10">
                <div class="relative text-gray-600">
                    <input type="search" name="serch" placeholder="Search" class="bg-white h-10 px-5 pr-10 rounded-full text-sm focus:outline-none">
                    <button type="submit" class="absolute right-0 top-0 mt-3 mr-4">
                        <svg class="h-4 w-4 fill-current" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="Capa_1" x="0px" y="0px" viewBox="0 0 56.966 56.966" style="enable-background:new 0 0 56.966 56.966;" xml:space="preserve" width="512px" height="512px">
                        <path d="M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23  s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92  c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17  s-17-7.626-17-17S14.61,6,23.984,6z"/>
                        </svg>
                    </button>
                </div>
          </div> -->

          <!-- Notification Icon  -->
          <button class="bg-gray-800 p-1 rounded-full text-gray-400">
            <span class="sr-only">View notifications</span>
            <BellIcon class="h-6 w-6 hover:text-red-500" aria-hidden="true" />
          </button>

          <!-- Profile dropdown -->
          <Menu as="div" class="ml-3 relative z-10">
            <div>
              <MenuButton
                class="
                  bg-gray-800
                  flex
                  text-sm
                  rounded-full
                  focus:outline-none
                  focus:ring-2
                  focus:ring-offset-2
                  focus:ring-offset-gray-800
                  focus:ring-white
                "
              >
                <span class="sr-only">Open user menu</span>
                <img
                  class="h-8 w-8 rounded-full"
                  src="https://images.unsplash.com/photo-1472099645785-5658abf4ff4e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80"
                  alt=""
                />
              </MenuButton>
            </div>

            <!-- If Logged In -->
            <div>
              <transition
                enter-active-class="transition ease-out duration-100"
                enter-from-class="transform opacity-0 scale-95"
                enter-to-class="transform opacity-100 scale-100"
                leave-active-class="transition ease-in duration-75"
                leave-from-class="transform opacity-100 scale-100"
                leave-to-class="transform opacity-0 scale-95"
              >
                <MenuItems
                  class="
                    origin-top-right
                    absolute
                    right-0
                    mt-5
                    w-48
                    rounded-md
                    shadow-lg
                    py-1
                    bg-gray-100
                    ring-1 ring-black ring-opacity-5
                    focus:outline-none
                  "
                >
                  <MenuItem v-slot="{ active }">
                    <router-link
                      :to="{ name: 'Profile' }"
                      :class="[
                        active ? 'bg-gray-300' : '',
                        'block px-4 py-2 text-sm text-gray-700',
                      ]"
                      >Your Profile</router-link
                    >
                  </MenuItem>
                  <MenuItem v-slot="{ active }">
                    <router-link
                      :to="{ name: 'Inbox' }"
                      :class="[
                        active ? 'bg-gray-300' : '',
                        'block px-4 py-2 text-sm text-gray-700',
                      ]"
                      >Inbox</router-link
                    >
                  </MenuItem>
                  <MenuItem v-slot="{ active }">
                    <router-link
                      :to="{ name: 'Settings' }"
                      :class="[
                        active ? 'bg-gray-300' : '',
                        'block px-4 py-2 text-sm text-gray-700',
                      ]"
                      >Settings</router-link
                    >
                  </MenuItem>
                  <MenuItem v-slot="{ active }">
                    <a
                      href="#"
                      :class="[
                        active ? 'bg-gray-300' : '',
                        'block px-4 py-2 text-sm text-gray-700',
                      ]"
                      >Sign out</a
                    >
                  </MenuItem>
                </MenuItems>
              </transition>
            </div>

            <!-- If Logged Out -->
            <div></div>
          </Menu>
        </div>
      </div>
    </div>

    <DisclosurePanel class="sm:hidden">
      <div class="px-2 pt-2 pb-3 space-y-1">
        <a
          v-for="item in navigation"
          :key="item.name"
          :href="item.href"
          :class="[
            item.current
              ? 'bg-gray-900 text-white'
              : 'text-gray-300 hover:bg-gray-700 hover:text-white',
            'block px-3 py-2 rounded-md text-base font-medium',
          ]"
          :aria-current="item.current ? 'page' : undefined"
          >{{ item.name }}</a
        >
      </div>
    </DisclosurePanel>
  </Disclosure>
</template>

<script>
  import { ref } from "vue";
  import {
    Disclosure,
    DisclosureButton,
    DisclosurePanel,
    Menu,
    MenuButton,
    MenuItem,
    MenuItems,
  } from "@headlessui/vue";
  import { BellIcon, MenuIcon, XIcon } from "@heroicons/vue/outline";

  export default {
    components: {
      Disclosure,
      DisclosureButton,
      DisclosurePanel,
      Menu,
      MenuButton,
      MenuItem,
      MenuItems,
      BellIcon,
      MenuIcon,
      XIcon,
    },
    setup() {
      const open = ref(false);
      return {
        open,
      };
    },
  };
</script>
