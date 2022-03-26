/*
  Simple example of a dropdown menu using HTML5 LocalStorage.
*/

function create_dropdown(menu_id, category_title_class) {
  var menu = document.getElementById(menu_id)
  var ctitles = menu.getElementsByClassName('category_title')
  for (var i = 0; i < ctitles.length; i++) {
    var ctitle = ctitles[i]
    apply_shown(ctitle, is_shown(ctitle))
    ctitle.onclick = toggle_callback(ctitle)
  }
}

function toggle_callback(ctitle_elem) {
  return function() { set_shown(ctitle_elem, !is_shown(ctitle_elem)) }
}

function get_key(ctitle_elem) {
  return  'dropdown category ' + ctitle_elem.childNodes[0].textContent.trim()
}

function is_shown(ctitle_elem) {
  var key = get_key(ctitle_elem)
  var state = localStorage.getItem(key) || 'true'
  return 'true' == state
}

function set_shown(ctitle_elem, shown) {
  var key = get_key(ctitle_elem)
  localStorage.setItem(key, shown)
  apply_shown(ctitle_elem, shown)
}

function apply_shown(ctitle_elem, shown) {
  var cbody = ctitle_elem.nextElementSibling
  cbody.style.display = shown ? 'block' : 'none'

  var arrow = shown ? '▲' : '▼'
  if (ctitle_elem.children.length > 0) {
      ctitle_elem.children[0].textContent = arrow
  }
  else {
      ctitle_elem.insertAdjacentHTML(
          'beforeend',
          '<span style="float: right; width: 1.5em">' + arrow + '</span>')
  }
}
