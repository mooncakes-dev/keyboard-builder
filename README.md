# Keyboard Builder


Keyboard Builder is aimed towards users who are interested in keyboard building. This app will allow user to create a hypothetical build for future reference. That build will also provide a user with the link of where they can purchase a specific part and the appropriate price.

If the user is new to the keyboard building, the website will supply them with a basic 101 guide and link to future resource reference.

As an added feature, we might have a list of the group buys that are coming up, including keycaps, cases and switches. This will provide users with further information and allow them to plan their building accordingly.


## Storyboard

 [Figma Design File ](https://www.figma.com/file/mFi0W76A6DZaUEYA7jh1Ek/Keyboard-Building-Website?node-id=0:1)


# Functional Cases


 - As a new keyboard enthusiast, I want to learn what I need to build a keyboard, so that I can buy all of the necessary parts.
	 - **Given** a guide page
	 - **When** a user chooses 101 guide
	 - **Then** the 101 guide loads with appropriate resources

 - As a keyboard enthusiast, I want to be able to put together a hypothetical keyboard, so that I can have an idea of how much it will be and what I need to get.
	 - **Given** a create-your-own form
	 - **When** user fills out and saves
	 - **Then** the build can be shared/saved

 - As a user I want to see a list of available switches options for my hypothetical keyboard
	 -  **Given** a tactile/ linear choice
	 -  **When** user picks a category
	 -  **Then** the list populates with the appropriate key switches options
    
 - As a keyboard enthusiast, I want to be able to see upcoming and current group-buys. Additionally, I would like to know which websites I can use to enter in the  group-buys.
	 - **Given**
	 - **When**
	 - **Then**

## Class Diagram

[class diagram](https://github.com/mooncakes-dev/keyboard-builder/blob/master/UML.PNG)

## JSON Schema
``` javascript
{
  "id": "http://keyboardbuilder.com",
  "$schema": "http://json-schema.org/draft-06/schema#",
  "title": "Build your own keyboard",
  "description": "Choose your keyboard parts and build extractly what you want, how you want",
  "$ref": "#/definitions/Welcome",
  "definitions": {
      "Welcome": { 
          "type": "object",
          "additionalProperties": false,
          "properties": {
              "keyboard" : {
                  "type" : "array",
                  "items" : {
                      "#/definitions/keyboard"
                      "#/definitions/pcb"
                      "#/definitions/plate"
                      "#/definitions/switches"
                  }
              }
          },
          "required" : [
              "keyboard"
              ],
              "title": "Welcome"
      },
      "Keyboard" : {
          "type": "object",
          "addtionalProperties": false,
          "properties": {
              "material": {
                  "type": "String"
              },
              "layout": {
                  "type": "Integer"
              },
          }
      }
      "PCB" : {
          "type": "object",
          "addtionalProperties": false,
          "properties": {
              "type": {
                  "type": "String"
                  
              },
              "layout": {
                  "type": "Integer"
              },
              "brand": {
                  "type": "String"
              },
              "hot-swap": {
                  "type": "boolean"
              },
          }
      }
      "Switches" : {
          "type": "object",
          "addtionalProperties": false,
          "properties": {
              "type": {
                  "type": "String"
              },
              "weight": {
                  "type": "Integer"
              },
              "brand": {
                  "type": "String"
              },
              "color": {
                  "type": "String"
              },
          }
      }
      "Plate" : {
          "type": "object",
          "addtionalProperties": false,
          "properties": {
              "material" : {
              "type": "String"
              },
              "layout": {
                  "type": "Integer"
              },
          }
      }
  }
}
```

## Scrum Roles

**UI/Scrum Master** – Mariya

**Business Logic** – Jamal

## Kanban

[Milestone #1 Kanban](https://github.com/mooncakes-dev/keyboard-builder/projects/1)

## Teams Meeting

[Join Our Meeting](https://teams.microsoft.com/l/meetup-join/19:meeting_ZWJlZDFhYmYtZTVlOC00ODMyLWFmN2ItN2Y5ODlmOGU4NjBh@thread.v2/0?context=%7B%22Tid%22:%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22,%22Oid%22:%22fcd19be3-0eff-4626-ae7d-1a8c92103bc1%22%7D)
