import * as React from 'react';
import { ReactMultiEmail, isEmail } from 'react-multi-email';
import 'react-multi-email/dist/style.css';



function Email(props) {
  const [emails, setEmails] = React.useState([]);
  const [focused, setFocused] = React.useState(false);
  console.log(emails)
  return (
    <>
      <h3>Email</h3>
      <ReactMultiEmail
        placeholder='Input your email'
        emails={emails}
        onChange={(_emails) => {
          setEmails(_emails);
        }}
        onFocus={() => setFocused(true)}
        onBlur={() => setFocused(false)}
        getLabel={(email, index, removeEmail) => {
          return (
            <div data-tag key={index}>
              <div data-tag-item>{email}</div>
              <span data-tag-handle onClick={() => removeEmail(index)}>
                ×
              </span>
            </div>
          );
        }}
      />
      <br />

      <p>{emails.join(',   ') || 'Enter atleast One Email'}</p>
    </>
  );
}

export default Email;