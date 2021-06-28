<template>
  <div class="bg-gray-100">
    <div class="container mx-auto my-5 p-5">
      <div class="md:flex no-wrap md:-mx-2">
        <!-- Left Side -->
        <div class="w-full md:w-3/12 md:mx-2">
          <!-- Profile Card -->
          <div class="bg-white p-3 min-h-100 border-t-4 border-gray-500">
            <div class="image overflow-hidden">
              <img
                class="h-52 w-52 mx-auto"
                src="https://lavinephotography.com.au/wp-content/uploads/2017/01/PROFILE-Photography-112.jpg"
                alt=""
              />
            </div>
            <input
              type="text"
              class="font-bold text-xl leading-8 my-1"
              placeholder="FullName"
            />
            <input
              type="text"
              class="font-lg text-semibold leading-6"
              placeholder="Company Inc."
            />
            <textarea
              class="text-sm leading-6"
              placeholder="BIO"
              name=""
              id=""
              cols="30"
              rows="10"
            ></textarea>
            <ul
              class="
                bg-gray-100
                text-gray-600
                hover:text-gray-700 hover:shadow
                py-2
                px-3
                mt-3
                divide-y
                rounded
                shadow-sm
              "
            >
              <li class="flex items-center py-3">
                <span>Status</span>
                <span class="ml-auto"
                  ><span
                    class="bg-green-500 py-1 px-2 rounded text-white text-sm"
                    >Active</span
                  ></span
                >
              </li>
            </ul>
          </div>
          <!-- End of profile card -->
        </div>

        <!-- Right Side -->
        <div class="w-full md:w-9/12 mx-2 h-64">
          <!-- About Section -->
          <div class="bg-white min-h-50 p-3 shadow-sm rounded-sm">
            <div
              class="
                flex
                items-center
                space-x-2
                font-semibold
                text-gray-900
                leading-8
              "
            >
              <span clas="text-green-500">
                <svg
                  class="h-5"
                  xmlns="http://www.w3.org/2000/svg"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    stroke-width="2"
                    d="M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z"
                  />
                </svg>
              </span>
              <span class="tracking-wide">About</span>
            </div>
            <div class="text-gray-700">
              <div class="grid md:grid-cols-2 text-sm">
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">First Name</div>
                  <input
                    type="text"
                    class="px-4 py-2"
                    placeholder="Firstname"
                  />
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Last Name</div>
                  <input type="text" class="px-4 py-2" placeholder="Doe" />
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Gender</div>
                  <div class="px-4 py-2">Female</div>
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Contact No.</div>
                  <input
                    type="text"
                    class="px-4 py-2"
                    placeholder="Phone Number"
                  />
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Current Address</div>
                  <div class="px-4 py-2">Beech Creek, PA, Pennsylvania</div>
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Permanant Address</div>
                  <div class="px-4 py-2">Arlington Heights, IL, Illinois</div>
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Email.</div>
                  <input
                    type="text"
                    class="px-4 py-2"
                    placeholder="jane@example.com"
                  />
                </div>
                <div class="grid grid-cols-2">
                  <div class="px-4 py-2 font-semibold">Member since</div>
                  <div class="px-4 py-2">Nov 07, 2016</div>
                </div>
              </div>
            </div>
          </div>
          <!-- End of about section -->

          <div class="my-4"></div>

          <!-- Experience and Education -->
          <div class="bg-white min-h-50 p-3 shadow-sm rounded-sm">
            <div class="grid grid-cols-2">
              <div>
                <div
                  class="
                    flex
                    items-center
                    space-x-2
                    font-semibold
                    text-gray-900
                    leading-8
                    mb-3
                  "
                >
                  <span clas="text-green-500">
                    <svg
                      class="h-5"
                      xmlns="http://www.w3.org/2000/svg"
                      fill="none"
                      viewBox="0 0 24 24"
                      stroke="currentColor"
                    >
                      <path
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="2"
                        d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"
                      />
                    </svg>
                  </span>

                  <!-- Experience -->
                  <span class="tracking-wide">Experience</span>
                </div>
                <ul class="list-inside space-y-2">
                  <li>
                    <input type="text" placeholder="Company" />
                    <input class="text-gray-500 text-xs" placeholder="March 2020 - Now" />
                  </li>
                </ul>
              </div>

              <!-- Education -->
              <div>
                <div
                  class="
                    flex
                    items-center
                    space-x-2
                    font-semibold
                    text-gray-900
                    leading-8
                    mb-3
                  "
                >
                  <span clas="text-green-500">
                    <svg
                      class="h-5"
                      xmlns="http://www.w3.org/2000/svg"
                      fill="none"
                      viewBox="0 0 24 24"
                      stroke="currentColor"
                    >
                      <path fill="#fff" d="M12 14l9-5-9-5-9 5 9 5z" />
                      <path
                        fill="#fff"
                        d="M12 14l6.16-3.422a12.083 12.083 0 01.665 6.479A11.952 11.952 0 0012 20.055a11.952 11.952 0 00-6.824-2.998 12.078 12.078 0 01.665-6.479L12 14z"
                      />
                      <path
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        stroke-width="2"
                        d="M12 14l9-5-9-5-9 5 9 5zm0 0l6.16-3.422a12.083 12.083 0 01.665 6.479A11.952 11.952 0 0012 20.055a11.952 11.952 0 00-6.824-2.998 12.078 12.078 0 01.665-6.479L12 14zm-4 6v-7.5l4-2.222"
                      />
                    </svg>
                  </span>
                  <span class="tracking-wide">Education</span>
                </div>
                <ul class="list-inside space-y-2">
                  <li>
                    <input
                      type="text"
                      class=""
                      placeholder="School and Degree"
                    />
                    <input class="text-gray-500 text-xs" placeholder="March 2020 - Now" />
                  </li>
                </ul>
              </div>
            </div>
            <!-- End of Experience and education grid -->
          </div>
          <!-- End of profile tab -->
        </div>
      </div>
    </div>
  </div>
  <!-- Save -->
  <div>
    <div class="flex justify-center">
      <button class="p-2 border w-1/4 rounded-md bg-gray-800 text-white">
        Save
      </button>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Profile",
  };
</script>

<style scoped>
  :root {
    --main-color: #4a76a8;
  }

  .bg-main-color {
    background-color: var(--main-color);
  }

  .text-main-color {
    color: var(--main-color);
  }

  .border-main-color {
    border-color: var(--main-color);
  }
</style>
